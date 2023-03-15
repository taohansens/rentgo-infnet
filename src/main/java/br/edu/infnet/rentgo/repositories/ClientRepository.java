package br.edu.infnet.rentgo.repositories;

import br.edu.infnet.rentgo.entities.Client;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepository {
   private List<Client> clientList = new ArrayList<>();

   public List<Client> findAll(){
        return clientList;
   }

    public boolean addClient(Client client) {
        try{
            clientList.add(client);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
