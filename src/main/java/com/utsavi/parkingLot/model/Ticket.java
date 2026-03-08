package com.utsavi.parkingLot.model;

import java.sql.Timestamp;

public class Ticket {
  private int id;
  private Timestamp entryTime;
  private Vehilcle vehilcle;
  private Operator operator;
  private Floor floor;
}
