package com.example.pc1dbp20261.controller;

import jdk.jfr.Event;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/events")


public class EventController {
    private final EventService eventService;
    private final TicketTypeService ticketTypeService;

    @PostMapping
    public ResponseEntity<EventResponse> create (@Valid @RequestBody EventCreateRequest request){
        return ResponseEntity.status(HttpStatus.CREATED.body (eventService.create(request);

     @GetMapping
     public ResponseEntity<List<EventResponse>> findAll()) {
            return ResponseEntity.ok(eventService.findAll()));
     @GetMapping("/{id}")
     public ResponseEntity<Event Response> findById (@PathVariable Longid){
         return ResponseEntity.ok(eventService.findBy(id));


         @PostMapping ("/{event Id}/tickettypes")
         public ResponseEntity<TicketTypeResponse>createTicketType(@PathVariable LongeventId, @Valid @RequestBody TicketTypeCreateRequest request ){
            return ResponseEntity.status(HttpStatus.CREATED).body(ticketTypeService.create(eventId,request));

    }
}
