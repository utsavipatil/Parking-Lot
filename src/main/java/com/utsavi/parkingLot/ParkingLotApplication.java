package com.utsavi.parkingLot;

import com.utsavi.parkingLot.controller.TicketController;
import com.utsavi.parkingLot.dto.IssueTicketRequest;
import com.utsavi.parkingLot.dto.IssueTicketResponse;
import com.utsavi.parkingLot.enums.ResponseStatus;
import com.utsavi.parkingLot.enums.VehicleType;
import com.utsavi.parkingLot.repository.GateRepository;
import com.utsavi.parkingLot.repository.ParkingLotRepository;
import com.utsavi.parkingLot.repository.TicketRepository;
import com.utsavi.parkingLot.repository.VehicleRepository;
import com.utsavi.parkingLot.service.TicketService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingLotApplication {

	public static void main(String[] args) {
		GateRepository gateRepository = new GateRepository();
		VehicleRepository vehicleRepository = new VehicleRepository();
		TicketRepository ticketRepository = new TicketRepository();
		ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

		TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository, ticketRepository);

		TicketController ticketController = new TicketController(ticketService);

		IssueTicketRequest issueTicketRequest =
				IssueTicketRequest.builder().licensePlate("GJ0124324").gateId(1L).ownerName("Dolly").vehicleType(VehicleType.TWO_WHEELER).parkingLotId(1L).build();

		IssueTicketResponse issueTicketResponse = ticketController.issueTicket(issueTicketRequest);

		if(issueTicketResponse.getResponseStatus().equals(ResponseStatus.SUCCESS)){
			System.out.println("Ticket Generated Successful ! Ticket Id: " + issueTicketResponse.getTicketId());
			System.out.println("Pl Park at " + issueTicketResponse.getSlotNumber() );
		}else if(issueTicketResponse.getResponseStatus().equals(ResponseStatus.FAILURE)){
			System.out.println("Failed to generate Ticket : " + issueTicketResponse.getFailureMessage());
		}
	}

}

/*
 * Generating Ticket[based on model/functionality we decide controller] : Ticket => TicketController : TicketService
 * UpdateSlotService => SlotController => SlotService
 * AdminController => AdminService
 */