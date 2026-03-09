package com.utsavi.parkingLot.model;

import com.utsavi.parkingLot.enums.FeeCalculationStrategy;
import com.utsavi.parkingLot.enums.SlotStatus;
import com.utsavi.parkingLot.enums.VehicleType;
import com.utsavi.parkingLot.stratergy.slot.SlotAssigningStrategy;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class ParkingLot extends BaseModel{
  private Operator operator;
  private List<Gate> exitGates;
  private List<Gate> entryGates;
  private List<Floor> floors;
  private HashMap<VehicleType, Integer> allowedVehicleTypes;
  private SlotStatus slotStatus;
  private FeeCalculationStrategy feeCalculationStrategy;
  private SlotAssigningStrategy slotAssigningStrategy; //May be Factory / Registry Pattern to get this stratergy

  //Whenever we decide to create HashMap, we should think if we can actually create a class Instead
  //Using booleans not got idea

}
