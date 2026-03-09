package com.utsavi.parkingLot.dto;

import com.utsavi.parkingLot.enums.ResponseStatus;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IssueTicketResponse {
  private Long ticketId;
  private ResponseStatus responseStatus;
  private String failureMessage;
  private Integer slotNumber;
}
