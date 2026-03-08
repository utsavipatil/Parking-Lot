package com.utsavi.parkingLot.dto;

import lombok.Data;

@Data
public class IssueTicketRequest {
  private String licenseNumber;
  private String ownerName;
  private int gateId;
}
