package br.edu.infnet.rentgo.repositories;

import br.edu.infnet.rentgo.entities.Store;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StoreRepository {
   private List<Store> storesList = new ArrayList<>();

   public List<Store> findAll(){
        return storesList;
   }

    public boolean addStore(Store store) {
        try{
            storesList.add(store);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
