package com.utsavi.parkingLot.model;

import com.utsavi.parkingLot.enums.VehicleType;

import java.util.List;

public class Floor {
  private int id;
  private Slot slot;
  private List<VehicleType> allowedVehicles;
}
