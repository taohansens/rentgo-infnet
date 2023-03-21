package br.edu.infnet.rentgo.repositories;

import br.edu.infnet.rentgo.entities.Client;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SClientRepository {
    private Map<Integer, Client> mapClients = new HashMap<>();
    private Integer id = 1;

   public List<Client> findAll(){
        return mapClients.values().stream().toList();
   }

    public boolean addClient(Client client) {
        client.setId(id++);
        try{
            mapClients.put(client.getId(), client);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public Client delete(Integer key) {
        return mapClients.remove(key);
    }
}
