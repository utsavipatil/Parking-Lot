package com.utsavi.parkingLot.dto;

import com.utsavi.parkingLot.enums.ResponseStatus;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class IssueTicketResponse {
  private Long ticketId;
  private ResponseStatus responseStatus;
  private String failureMessage;
}
