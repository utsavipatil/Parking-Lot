package com.utsavi.parkingLot.stratergy.slot;

import com.utsavi.parkingLot.enums.SlotStatus;
import com.utsavi.parkingLot.enums.VehicleType;
import com.utsavi.parkingLot.model.Floor;
import com.utsavi.parkingLot.model.ParkingLot;
import com.utsavi.parkingLot.model.Slot;

public class RandomAssigning implements SlotAssigningStrategy{
  @Override
  public Slot assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {
    for(Floor floor: parkingLot.getFloors()){
      for(Slot slot: floor.getSlots()){
        if(slot.getAllowedVehicleTypes().contains(vehicleType) && slot.getSlotStatus().equals(SlotStatus.EMPTY)){
          return slot;
        }
      }
    }
    return null;
  }
}
