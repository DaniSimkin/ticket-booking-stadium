package com.dani.ticketServiceStadium;

import com.dani.ticketServiceStadium.dao.TicketRepository;
import com.dani.ticketServiceStadium.model.Ticket;
import com.dani.ticketServiceStadium.utils.Utils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class TicketServiceStadiumApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketServiceStadiumApplication.class, args);
	}

}
