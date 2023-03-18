package br.edu.infnet.rentgo.repositories;

import br.edu.infnet.rentgo.entities.CredentialUser;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CredentialRepository {
    private Map<Integer, CredentialUser> mapCredentialUser = new HashMap<>();
    private Integer id = 1;

    public Collection<CredentialUser> getAll() {
        return mapCredentialUser.values();
    }

    public boolean insert(CredentialUser credentialUser) {
        credentialUser.setId(id++);
        try {
            mapCredentialUser.put(credentialUser.getId(), credentialUser);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public CredentialUser delete(Integer key) {
        return mapCredentialUser.remove(key);
    }

    public boolean login(CredentialUser credentialUser) {
        for (CredentialUser c : mapCredentialUser.values().stream().toList()){
            if(Objects.equals(c.getEmail(), credentialUser.getEmail()) &&
                    Objects.equals(c.getPassword(), credentialUser.getPassword())) {
                return true;}
        }
        return false;
    }
}