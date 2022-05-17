package com.dani.ticketServiceStadium.entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@Document(collection = "tickets")
public class TicketDocument implements Persistable<String> {

    @Id
    @JsonProperty("objectID")
    private String id;

    @Field("userId")
    private String userId;
    @Field("section")
    private String section;
    @Field("row")
    private Integer row;
    @Field("seat")
    private Integer seat;
    @Indexed
    private String hash;

    public TicketDocument(String userId, String section, Integer row, Integer seat, String hash) {
        this.userId = userId;
        this.section = section;
        this.row = row;
        this.seat = seat;
        this.hash = hash;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
