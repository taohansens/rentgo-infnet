package br.edu.infnet.rentgo.services;

import br.edu.infnet.rentgo.dtos.StoreDTO;
import br.edu.infnet.rentgo.entities.Store;
import br.edu.infnet.rentgo.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreService {
    @Autowired
    private StoreRepository repository;

    public List<StoreDTO> getAll() {
        Collection<Store> list = (Collection<Store>) repository.findAll();
        return list.stream().map(x -> new StoreDTO(x.getId(), x.getName(), x.getAddress().getLogradouro(), x.getAddress().getComplemento(),
                x.getAddress().getBairro(), x.getAddress().getCidade(), x.getAddress().getEstado(), x.getAddress().getCep(),
                        x.getVehicles())).collect(Collectors.toList());
    }
    public boolean insert(StoreDTO storeDTO) {
        Store store = new Store(storeDTO);
        Store storeDB = repository.save(store);
        return storeDB.getId() != null;
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
