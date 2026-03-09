package com.utsavi.parkingLot.dto;

import com.utsavi.parkingLot.enums.VehicleType;
import com.utsavi.parkingLot.model.ParkingLot;
import com.utsavi.parkingLot.model.Vehicle;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IssueTicketRequest {
  private String licensePlate;
  private String ownerName;
  private VehicleType vehicleType;
  private Long gateId;
  private Long parkingLotId ;
}
