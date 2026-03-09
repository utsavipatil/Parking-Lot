package com.utsavi.parkingLot.model;

import com.utsavi.parkingLot.enums.SlotStatus;
import com.utsavi.parkingLot.enums.VehicleType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class Slot extends BaseModel{
  private Integer slotNumber; //Slot Number can be repeated, id is specifically for Database to make unique
  private Set<VehicleType> allowedVehicleTypes;
  private SlotStatus slotStatus;
  private Floor floor;
}
