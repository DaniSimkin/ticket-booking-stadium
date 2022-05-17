package com.dani.ticketServiceStadium.dao;

import com.dani.ticketServiceStadium.entity.TicketDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends MongoRepository<TicketDocument, String> {

    @Query("{hash:'?0'}")
    TicketDocument findTicketByHash(String hash);

}
