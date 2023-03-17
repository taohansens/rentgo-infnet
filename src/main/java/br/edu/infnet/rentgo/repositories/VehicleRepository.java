package br.edu.infnet.rentgo.repositories;

import br.edu.infnet.rentgo.entities.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VehicleRepository {
   private List<Vehicle> vehicleList = new ArrayList<>();

   public List<Vehicle> findAll(){
        return vehicleList;
   }

    public boolean addVehicle(Vehicle vehicle) {
        try{
            vehicleList.add(vehicle);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
