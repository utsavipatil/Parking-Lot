package com.utsavi.parkingLot.controller;

import com.utsavi.parkingLot.dto.IssueTicketRequest;
import com.utsavi.parkingLot.dto.IssueTicketResponse;
import com.utsavi.parkingLot.enums.ResponseStatus;
import com.utsavi.parkingLot.model.Ticket;
import com.utsavi.parkingLot.service.TicketService;

public class TicketController {

  private TicketService ticketService;

  public TicketController(TicketService ticketService){
    this.ticketService = ticketService;
  }

  public IssueTicketResponse issueTicket(IssueTicketRequest request){

    try{
       Ticket ticket = ticketService.issueTicket(request.getGateId(), request.getLicensePlate(), request.getOwnerName(),request.getVehicleType(), request.getParkingLotId());
       return IssueTicketResponse.builder().ticketId(ticket.getId()).responseStatus(ResponseStatus.SUCCESS).slotNumber(ticket.getSlot().getSlotNumber()).build();

     } catch (Exception e) {
      return IssueTicketResponse.builder().responseStatus(ResponseStatus.FAILURE).failureMessage(e.getMessage()).build();
     }
  }
}
