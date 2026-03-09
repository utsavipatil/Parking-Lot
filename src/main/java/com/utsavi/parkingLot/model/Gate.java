package com.utsavi.parkingLot.model;

import com.utsavi.parkingLot.enums.GateStatus;
import com.utsavi.parkingLot.enums.GateType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Gate extends BaseModel{
  private String gateNumber;
  private GateType gateType;
  private GateStatus gateStatus;
  private Operator currentOperator;
}
