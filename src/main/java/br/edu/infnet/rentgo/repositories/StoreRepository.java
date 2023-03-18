package br.edu.infnet.rentgo.repositories;

import br.edu.infnet.rentgo.entities.Store;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StoreRepository {
    private Map<Integer, Store> mapStore = new HashMap<>();
    private Integer id = 1;

    public List<Store> findAll() {
        return mapStore.values().stream().toList();
    }

    public boolean addStore(Store store) {
        store.setId(id++);
        try {
            mapStore.put(store.getId(), store);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Store delete(Integer key) {

        return mapStore.remove(key);
    }
}

