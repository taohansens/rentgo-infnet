package br.edu.infnet.rentgo.services;

import br.edu.infnet.rentgo.dtos.StoreDTO;
import br.edu.infnet.rentgo.entities.Store;
import br.edu.infnet.rentgo.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreRepository repository;

    public List<StoreDTO> getAll() {
        List<Store> list = repository.findAll();
        return list.stream().map(x -> new StoreDTO(x.getId(), x.getName(), x.getAddress().getLogradouro(), x.getAddress().getComplemento(),
                x.getAddress().getBairro(), x.getAddress().getCidade(), x.getAddress().getEstado(), x.getAddress().getCep())).toList();
    }

    public boolean insert(StoreDTO storeDTO) {
        Store store = new Store(storeDTO);
        return repository.addStore(store);
    }

    public StoreDTO delete(int id) {
        Store store = repository.delete(id);
        return new StoreDTO(store.getId(), store.getName(), store.getAddress().getLogradouro(), store.getAddress().getComplemento(),
                store.getAddress().getBairro(), store.getAddress().getCidade(), store.getAddress().getEstado(), store.getAddress().getCep());
    }
}
