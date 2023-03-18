package br.edu.infnet.rentgo.repositories;

import br.edu.infnet.rentgo.entities.Vehicle;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class VehicleRepository {
    private Map<Integer, Vehicle> mapVehicles = new HashMap<>();
    private Integer id = 1;

   public List<Vehicle> findAll(){
       return mapVehicles.values().stream().toList();
   }

    public boolean addVehicle(Vehicle vehicle) {
        vehicle.setId(id++);
        try {
            mapVehicles.put(vehicle.getId(), vehicle);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Vehicle delete(Integer key) {
        return mapVehicles.remove(key);
    }
}
