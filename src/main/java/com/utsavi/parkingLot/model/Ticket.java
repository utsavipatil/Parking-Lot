package com.utsavi.parkingLot.model;

import com.utsavi.parkingLot.enums.FeeCalculationStrategy;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Ticket extends BaseModel{
  private Timestamp entryTime;
  private Vehicle vehicle;
  private Gate entryGate;
  private Operator operator;
  private Slot slot;
  private FeeCalculationStrategy feeCalculationStrategy;
}
