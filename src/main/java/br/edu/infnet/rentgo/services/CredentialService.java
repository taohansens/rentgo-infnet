package br.edu.infnet.rentgo.services;

import br.edu.infnet.rentgo.dtos.CredentialUserDTO;
import br.edu.infnet.rentgo.entities.CredentialUser;
import br.edu.infnet.rentgo.repositories.CredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CredentialService {
    @Autowired
    private CredentialRepository repository;

    public boolean checkLogin(CredentialUserDTO userDTO) {
        CredentialUser user = new CredentialUser(userDTO.email, userDTO.password);
        return repository.login(user);
    }
}
