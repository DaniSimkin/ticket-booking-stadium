package com.dani.ticketServiceStadium.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Data
@AllArgsConstructor
public class Ticket {

    @Email
    @NotEmpty(message = "Email cannot be empty")
    private String userId;

    @NotNull(message = "Section cannot be null")
    @Pattern(regexp = "[a-fA-F]")
    private String section;

    @NotNull(message = "Row cannot be null")
    @Range(min = 1, max = 100)
    private Integer row;

    @NotNull(message = "Seat cannot be null")
    @Range(min = 1, max = 100)
    private Integer seat;

}
