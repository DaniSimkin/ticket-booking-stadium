package com.dani.ticketServiceStadium.service.impl;

import com.dani.ticketServiceStadium.dao.TicketRepository;
import com.dani.ticketServiceStadium.entity.TicketDocument;
import com.dani.ticketServiceStadium.model.Ticket;
import com.dani.ticketServiceStadium.service.TicketService;
import com.dani.ticketServiceStadium.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Boolean bookTicket(Ticket ticket) {

        String hashedValue = Utils.generateTicketHash(ticket.getSection(), ticket.getRow(), ticket.getSeat());

        if (ticketRepository.findTicketByHash(hashedValue) == null){
            TicketDocument ticketDocument = new TicketDocument(ticket.getUserId(), ticket.getSection().toUpperCase(), ticket.getRow(), ticket.getSeat(), hashedValue);
            ticketRepository.insert(ticketDocument);
            return true;
        }
        return false;

    }
}