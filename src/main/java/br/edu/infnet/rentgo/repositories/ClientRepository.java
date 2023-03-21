package br.edu.infnet.rentgo.repositories;
import br.edu.infnet.rentgo.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>{
}
