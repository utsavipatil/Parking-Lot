package com.utsavi.parkingLot.repository;

import com.utsavi.parkingLot.model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
  private Map<Long, Ticket> tickets = new HashMap<>();
  private static Long counter = 0L;

  public Ticket save(Ticket ticket){
    ticket.setId(++counter);
    tickets.put(ticket.getId(), ticket);
    return ticket;
  }
}
