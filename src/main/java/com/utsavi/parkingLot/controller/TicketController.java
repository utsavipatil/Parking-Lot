package com.utsavi.parkingLot.controller;

import com.utsavi.parkingLot.dto.IssueTicketRequest;
import com.utsavi.parkingLot.dto.IssueTicketResponse;
import com.utsavi.parkingLot.enums.ResponseStatus;
import com.utsavi.parkingLot.model.Ticket;
import com.utsavi.parkingLot.service.TicketService;

public class TicketController {

  private TicketService ticketService;

  public TicketController(){
    this.ticketService = new TicketService();
  }

  public IssueTicketResponse issueTicket(IssueTicketRequest request){

    try{
       Ticket ticket = ticketService.issueTicket(request.getGateId(), request.getLicensePlate(), request.getOwnerName(),request.getVehicleType(), request.getParkingLotId());
       return IssueTicketResponse.builder().ticketId(ticket.getId()).responseStatus(ResponseStatus.SUCCESS).build();

     } catch (Exception e) {
      return IssueTicketResponse.builder().responseStatus(ResponseStatus.FAILURE).failureMessage(e.getMessage()).build();
     }
  }
}
