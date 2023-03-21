package br.edu.infnet.rentgo.services;

import br.edu.infnet.rentgo.dtos.ClientDTO;
import br.edu.infnet.rentgo.entities.Client;
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
        return list.stream().map(x -> new ClientDTO(x.getId(), x.getName(), x.getEmail(), x.getTelefone(), x.getDocument().getRg(),
                x.getDocument().getCpf(), x.getDocument().getCnh(), x.getAddress().getLogradouro(), x.getAddress().getComplemento(),
                x.getAddress().getBairro(), x.getAddress().getCidade(), x.getAddress().getEstado(), x.getAddress().getCep(), x.isVerified())).toList();
    }

    public Client insert(ClientDTO clientDTO) {
        Client client = new Client(clientDTO);
        return repository.save(client);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
