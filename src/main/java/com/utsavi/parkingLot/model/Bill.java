package com.utsavi.parkingLot.model;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class Bill extends BaseModel{
  private Double amount; //For Double Rounding Off errors can lead to loss of revenue, 24.9 9-> store as 2499 then while calculating -> convert to 24.99
  private Timestamp exiTime;
  private Ticket ticket;
  private Operator operator;
  private List<Payment> payementList;
  private Gate exitGate;
}
