package com.utsavi.parkingLot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingLotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingLotApplication.class, args);
	}

}

/*
 * Generating Ticket[based on model/functionality we decide controller] : Ticket => TicketController : TicketService
 * UpdateSlotService => SlotController => SlotService
 * AdminController => AdminService
 */