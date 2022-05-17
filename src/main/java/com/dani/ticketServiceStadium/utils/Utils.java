package com.dani.ticketServiceStadium.utils;

public class Utils {

    private static final Integer TICKET_MARKING = 3;

    public static String generateTicketHash(String section, Integer row, Integer seat){
        StringBuilder hashed = new StringBuilder();
        hashed.append(section.toUpperCase()).append( lPadZero(row, TICKET_MARKING)).append(lPadZero(seat,TICKET_MARKING));
        return hashed.toString();
    }

    public static String lPadZero(int in, int fill){

        int value, len = 0;

            value = in;

            for(; value != 0; len ++){
                value /= 10;
            }

        StringBuilder sb = new StringBuilder();

        for(int i = fill; i > len; i--){
            sb.append('0');
        }

        sb.append(in);

        return sb.toString();
    }
}
