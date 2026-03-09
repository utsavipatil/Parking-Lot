package com.utsavi.parkingLot.repository;

import com.utsavi.parkingLot.enums.FeeCalculationStrategy;
import com.utsavi.parkingLot.enums.SlotStatus;
import com.utsavi.parkingLot.enums.VehicleType;
import com.utsavi.parkingLot.model.Floor;
import com.utsavi.parkingLot.model.ParkingLot;
import com.utsavi.parkingLot.model.Slot;
import com.utsavi.parkingLot.stratergy.slot.RandomAssigning;

import java.util.*;

public class ParkingLotRepository {
  private Map<Long, ParkingLot> parkingLots = new HashMap<>();

  public ParkingLotRepository() {
    ParkingLot parkingLot = new ParkingLot();
    parkingLot.setId(1L);
    
    Slot slot1 = new Slot();
    slot1.setId(1L);
    slot1.setSlotNumber(1);
    slot1.setSlotStatus(SlotStatus.EMPTY);
    slot1.setAllowedVehicleTypes(new HashSet<>(Arrays.asList(VehicleType.TWO_WHEELER, VehicleType.FOUR_WHEELER)));
    
    Floor floor1 = new Floor();
    floor1.setId(1L);
    floor1.setFloorNumber("1");
    floor1.setSlots(Arrays.asList(slot1));
    
    slot1.setFloor(floor1);
    
    parkingLot.setFloors(Arrays.asList(floor1));
    parkingLot.setFeeCalculationStrategy(FeeCalculationStrategy.WEEKDAY);
    parkingLot.setSlotAssigningStrategy(new RandomAssigning());
    
    parkingLots.put(1L, parkingLot);
  }

  public Optional<ParkingLot> findParkingLotById(Long id){
    return Optional.ofNullable(parkingLots.get(id));
  }
}
