package com.dani.ticketServiceStadium.controller;

import com.dani.ticketServiceStadium.model.Ticket;
import com.dani.ticketServiceStadium.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;



@RequestMapping("/ticketing")
@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/bookTicket")
    public ResponseEntity<String> saveProcess(@Valid @RequestBody Ticket ticket) {
        if(ticketService.bookTicket(ticket)){
            return new ResponseEntity<>("Ticket Successfully Booked", HttpStatus.CREATED);
        }
            return new ResponseEntity<>("Seat Is Already Taken", HttpStatus.BAD_REQUEST);
    }
}
