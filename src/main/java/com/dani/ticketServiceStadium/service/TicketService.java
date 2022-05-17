package com.dani.ticketServiceStadium.service;

import com.dani.ticketServiceStadium.model.Ticket;
import org.springframework.stereotype.Service;


@Service
public interface TicketService {

    Boolean bookTicket(Ticket ticket);

}

