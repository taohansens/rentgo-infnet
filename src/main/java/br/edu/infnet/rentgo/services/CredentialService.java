package br.edu.infnet.rentgo.services;

import br.edu.infnet.rentgo.dtos.CredentialUserDTO;
import br.edu.infnet.rentgo.entities.CredentialUser;
import br.edu.infnet.rentgo.repositories.CredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CredentialService {
    @Autowired
    private CredentialRepository repository;

    public CredentialUserDTO login(CredentialUserDTO credentialUserDTO) {
        CredentialUser credentialUser = new CredentialUser(credentialUserDTO);
        CredentialUser credentialUserDB = repository.autenticacao(credentialUser.getEmail(), credentialUser.getPassword());
        if(credentialUserDB != null) {
            return new CredentialUserDTO(credentialUserDB.getId(), credentialUserDB.getEmail(), credentialUserDB.getPassword());
        }
        return null;
    }

    public CredentialUserDTO insert(CredentialUserDTO credentialUserDTO) {
        CredentialUser credentialUser = new CredentialUser(credentialUserDTO);
        CredentialUser credentialUserBD = repository.save(credentialUser);
        return new CredentialUserDTO(credentialUserBD.getId(), credentialUserBD.getEmail(), credentialUserBD.getPassword());
    }

    public List<CredentialUserDTO> getAll() {
        Collection<CredentialUser> list = (Collection<CredentialUser>) repository.findAll();
        return list.stream().map(x -> new CredentialUserDTO(x.getId(), x.getEmail(), "******")).toList();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
