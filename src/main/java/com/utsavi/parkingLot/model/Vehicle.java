package com.utsavi.parkingLot.model;

import com.utsavi.parkingLot.enums.VehicleType;
import lombok.Data;

@Data
public class Vehicle extends BaseModel{
  private VehicleType vehicleType;
  private int licensePlate;
  private String ownerName;
}
