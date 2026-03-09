package com.utsavi.parkingLot.repository;

import com.utsavi.parkingLot.model.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {

  private Map<String, Vehicle> vehicles;

  private static Long counter = 0L;

  public VehicleRepository(){
    this.vehicles = new HashMap<>();
  }

  public Optional<Vehicle> findVehicleByLicenseNumber(String licenseNumber){
    if(vehicles.containsKey(licenseNumber)){
      return Optional.of(vehicles.get(licenseNumber));
    }

    return Optional.empty();
  }

  public Vehicle save(Vehicle vehicle){
    vehicle.setId(++counter);
    vehicles.put(vehicle.getLicensePlate(), vehicle);
    return vehicle;
  }
}
