package com.utsavi.parkingLot.model;

import com.utsavi.parkingLot.enums.VehicleType;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Builder
@Data
@EqualsAndHashCode(callSuper = true)
public class Vehicle extends BaseModel{
  private VehicleType vehicleType;
  private String licensePlate;
  private String ownerName;
}
