package br.edu.infnet.rentgo.repositories;

import br.edu.infnet.rentgo.entities.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends CrudRepository<Store, Integer> {
}
