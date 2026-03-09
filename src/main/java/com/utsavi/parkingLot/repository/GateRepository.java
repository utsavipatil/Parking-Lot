package com.utsavi.parkingLot.repository;

import com.utsavi.parkingLot.model.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
  private Map<Long, Gate> gates = new HashMap<>();

  public GateRepository() {
    Gate gate1 = new Gate();
    gate1.setId(1L);
    gate1.setGateNumber("G1");
    gates.put(1L, gate1);
  }

  public Optional<Gate> findGateByGateId(Long gateId){
    return Optional.ofNullable(gates.get(gateId));
  }
}
