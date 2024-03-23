package com.springreact.services;

import com.springreact.models.Client;
import com.springreact.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    
    public List<Client> getClients() {
        return (List<Client>)clientRepository.findAll();
    }
    
    public Client getClient(Long id) {
        return clientRepository.findById(id).orElseThrow(RuntimeException::new);
    }
    
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }
    
    public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
        Client currentClient = clientRepository.findById(id).orElseThrow(RuntimeException::new);
        currentClient.setFirstName((client.getFirstName()));
        currentClient.setEmail(client.getEmail());
        return clientRepository.save(client);
    }
    
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
