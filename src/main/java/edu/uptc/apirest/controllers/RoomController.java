package edu.uptc.apirest.controllers;

import edu.uptc.apirest.entities.Room;
import edu.uptc.apirest.services.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rooms")
public class RoomController {
    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getRooms(){

        return roomService.getRooms();

    }

    @GetMapping("/{id}")
    public Room findById( @PathVariable Integer id){

       return roomService.findById( id );
    }

    @PostMapping
    public Room save( @RequestBody Room room ){

        return roomService.save( room );
    }

    @PutMapping("/{id}")
    public Room update( @RequestBody Room room, @PathVariable int id){

       return roomService.update( room );
    }

    @DeleteMapping("/{id}")
    public Room delete( @PathVariable int id ){

        return roomService.delete(id);
    }
}
