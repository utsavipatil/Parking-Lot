package com.utsavi.parkingLot.model;

import com.utsavi.parkingLot.enums.FeeCalculationStrategy;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Ticket extends BaseModel{
  private Date entryTime;
  private Vehicle vehicle;
  private Gate entryGate;
  private Operator operator;
  private Slot slot;
  private FeeCalculationStrategy feeCalculationStrategy;
  private Floor floor;
}
