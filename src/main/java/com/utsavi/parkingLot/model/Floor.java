package com.utsavi.parkingLot.model;

import com.utsavi.parkingLot.enums.FloorStatus;
import com.utsavi.parkingLot.enums.VehicleType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class Floor extends BaseModel{
  private String floorNumber; //Floor Number can be repeated, id is specifically for Database to make unique
  private List<Slot> slots;
  private List<VehicleType> allowedVehicles;
  private FloorStatus floorStatus;
}
