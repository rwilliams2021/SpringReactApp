package com.springreact.controllers;

import com.springreact.repositories.ClientRepository;
import com.springreact.models.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    private final ClientRepository clientRepository;
    
    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    
    @GetMapping
    public List<Client> getClients() {
        return (List<Client>)clientRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Client getClient(@PathVariable Long id) {
        return clientRepository.findById(id).orElseThrow(RuntimeException::new);
    }
    
    @PostMapping
    public ResponseEntity createClient(@RequestBody Client client) throws URISyntaxException {
        Client savedClient = clientRepository.save(client);
        return ResponseEntity.created(new URI("/clients/" + savedClient.getId())).body(savedClient);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity updateClient(@PathVariable Long id, @RequestBody Client client) {
        Client currentClient = clientRepository.findById(id).orElseThrow(RuntimeException::new);
        currentClient.setFirstName((client.getFirstName()));
        currentClient.setEmail(client.getEmail());
        currentClient = clientRepository.save(client);
        
        return ResponseEntity.ok(currentClient);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity deleteClient(@PathVariable Long id) {
        clientRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
