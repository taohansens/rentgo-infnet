package br.edu.infnet.rentgo.services;

import br.edu.infnet.rentgo.dtos.CredentialUserDTO;
import br.edu.infnet.rentgo.dtos.VehicleDTO;
import br.edu.infnet.rentgo.entities.CredentialUser;
import br.edu.infnet.rentgo.entities.Vehicle;
import br.edu.infnet.rentgo.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository repository;

    public List<VehicleDTO> getAll() {
        List<Vehicle> list = repository.findAll();
        return list.stream().map(x -> new VehicleDTO(x.getId(), x.getPlaca())).toList();
    }

    public boolean insert(VehicleDTO vehicleDTO) {
        Vehicle vehicle = new Vehicle(vehicleDTO);
        return repository.addVehicle(vehicle);
    }

    public VehicleDTO delete(int id) {
        Vehicle vehicle = repository.delete(id);
        return new VehicleDTO(vehicle.getId(), vehicle.getPlaca());
    }
}
