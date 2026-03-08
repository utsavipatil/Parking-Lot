package com.utsavi.parkingLot.model;

import com.utsavi.parkingLot.enums.VehicleType;
import lombok.Data;

import java.util.List;

@Data
public class Slot extends BaseModel{
  private Integer slotNumber; //Slot Number can be repeated, id is specifically for Database to make unique
  private List<VehicleType> allowedVehicleTypes;
}
