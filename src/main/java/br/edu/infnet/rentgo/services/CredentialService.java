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
        CredentialUser loggedUser = repository.login(credentialUser);
        if(loggedUser != null) {
            return new CredentialUserDTO(loggedUser.getId(), loggedUser.getEmail(), "******");
        }
        return null;
    }

    public boolean insert(CredentialUserDTO credentialUserDTO) {
        CredentialUser credentialUser = new CredentialUser(credentialUserDTO);
        return repository.insert(credentialUser);
    }

    public List<CredentialUserDTO> getAll() {
        Collection<CredentialUser> list = repository.getAll();
        return list.stream().map(x -> new CredentialUserDTO(x.getId(), x.getEmail(), "******")).toList();
    }

    public CredentialUserDTO delete(int id) {
        CredentialUser user = repository.delete(id);
        return new CredentialUserDTO(user.getId(), user.getEmail(), "******");
    }
}
