package com.utsavi.parkingLot.service;

import com.utsavi.parkingLot.enums.SlotStatus;
import com.utsavi.parkingLot.enums.VehicleType;
import com.utsavi.parkingLot.model.*;
import com.utsavi.parkingLot.repository.GateRepository;
import com.utsavi.parkingLot.repository.ParkingLotRepository;
import com.utsavi.parkingLot.repository.TicketRepository;
import com.utsavi.parkingLot.repository.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {

  private GateRepository gateRepository;
  private VehicleRepository vehicleRepository;
  private ParkingLotRepository parkingLotRepository;
  private TicketRepository ticketRepository;

  public TicketService(){
    this.gateRepository = new GateRepository();
    this.vehicleRepository = new VehicleRepository();
  }

  public Ticket issueTicket(Long gateId, String licensePlate, String ownerName, VehicleType vehicleType, Long parkingLotId){

    //1. Get gate details using gateID
    Optional<Gate> gateOptional = gateRepository.findGateByGateId(gateId);
    if(gateOptional.isEmpty()){
      throw new RuntimeException("Gate id is invalid");
    }
    
    Gate gate = gateOptional.get();
    
    //2. If Vehicle not present , create new one
    Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByLicenseNumber(licensePlate);
    Vehicle vehicleInfo = null;
    if(vehicleOptional.isEmpty()){
       vehicleInfo = Vehicle.builder().licensePlate(licensePlate).ownerName(ownerName).vehicleType(vehicleType).build();
       vehicleRepository.save(vehicleInfo); //save to DB
    }else{
      vehicleInfo = vehicleOptional.get();
    }

    //3. Get Slot using algo
    Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findParkingLotById(parkingLotId);
    if(parkingLotOptional.isEmpty()){
      throw new RuntimeException("Invalid Parking Lot Id");
    }
    ParkingLot parkingLot = parkingLotOptional.get();

    Slot slot = parkingLot.getSlotAssigningStrategy().assignSlot(parkingLot, vehicleType);
    slot.setSlotStatus(SlotStatus.FILLED);

    //4. Create new Ticket Object, set attributes
    Ticket ticket = Ticket.builder()
        .entryTime(new Date())
        .entryGate(gate)
        .operator(gate.getCurrentOperator())
        .vehicle(vehicleInfo)
        .slot(slot)
        .feeCalculationStrategy(parkingLot.getFeeCalculationStrategy())
        .floor(slot.getFloor()).build();

    //5. return object
    return ticketRepository.save(ticket);
  }
}
