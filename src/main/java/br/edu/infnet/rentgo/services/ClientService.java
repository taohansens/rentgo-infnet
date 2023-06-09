package br.edu.infnet.rentgo.services;

import br.edu.infnet.rentgo.dtos.ClientDTO;
import br.edu.infnet.rentgo.entities.Client;
import br.edu.infnet.rentgo.entities.CredentialUser;
import br.edu.infnet.rentgo.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public List<ClientDTO> getAll() {
        Collection<Client> list = (Collection<Client>) repository.findAll();
        return list.stream().map(x -> new ClientDTO(x.getId(), x.getName(), x.getTelefone(), x.getDocument().getRg(),
                x.getDocument().getCpf(), x.getDocument().getCnh(), x.getAddress().getLogradouro(), x.getAddress().getComplemento(),
                x.getAddress().getBairro(), x.getAddress().getCidade(), x.getAddress().getEstado(), x.getAddress().getCep(),
                x.isVerified(), x.getCredentialUser().getId(), x.getCredentialUser().getEmail())).toList();
    }

    public ClientDTO insert(ClientDTO clientDTO) {
        Client client = new Client(clientDTO);
        CredentialUser credentialUser = new CredentialUser();
        credentialUser.setId(clientDTO.getCredentialIdForm());
        client.setCredentialUser(credentialUser);
        Client clientDB = repository.save(client);
        return new ClientDTO(clientDB.getId(), clientDB.getName(), clientDB.getTelefone(), clientDB.getDocument().getRg(),
                clientDB.getDocument().getCpf(), clientDB.getDocument().getCnh(), clientDB.getAddress().getLogradouro(),
                clientDB.getAddress().getComplemento(), clientDB.getAddress().getBairro(), clientDB.getAddress().getCidade(),
                clientDB.getAddress().getEstado(), clientDB.getAddress().getCep(), clientDB.isVerified(), clientDB.getCredentialUser().getId(),
                clientDB.getCredentialUser().getEmail());
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
