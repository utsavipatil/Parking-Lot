package com.utsavi.parkingLot.stratergy.slot;

import com.utsavi.parkingLot.enums.VehicleType;
import com.utsavi.parkingLot.model.ParkingLot;
import com.utsavi.parkingLot.model.Slot;

public interface SlotAssigningStrategy {
  public Slot assignSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
