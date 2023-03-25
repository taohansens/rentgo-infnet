package br.edu.infnet.rentgo.services;

import br.edu.infnet.rentgo.dtos.VehicleDTO;
import br.edu.infnet.rentgo.entities.Store;
import br.edu.infnet.rentgo.entities.Vehicle;
import br.edu.infnet.rentgo.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository repository;

    public List<VehicleDTO> getAll() {
        Collection<Vehicle> list = (Collection<Vehicle>) repository.findAll();
        return list.stream().map(x -> new VehicleDTO(x.getId(), x.getPlaca(), x.getStore().getId(), x.getStore().getName())).toList();
    }

    public VehicleDTO insert(VehicleDTO vehicleDTO) {
        Store store = new Store();
        store.setId(vehicleDTO.getIdStoreForm());
        Vehicle vehicle = new Vehicle(vehicleDTO);
        vehicle.setStore(store);
        Vehicle vehicleDB = repository.save(vehicle);
        return new VehicleDTO(vehicleDB.getId(), vehicleDB.getPlaca(), vehicleDB.getStore().getId(), vehicleDB.getStore().getName());
    }

    public void delete(int id) {
        var vehicleBd = repository.findById(id);
        vehicleBd.ifPresent(vehicle -> repository.delete(vehicle));
    }
}
