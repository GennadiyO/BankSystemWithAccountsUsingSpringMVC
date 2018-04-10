package com.gazprombank.task1.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gazprombank.task1.dao.ClientDAO;
import com.gazprombank.task1.model.Client;

@Service
public class ClientServiceImpl  implements ClientService{
    private ClientDAO clietDAO;
    
    public void setClietDAO(ClientDAO clietDAO) {
        this.clietDAO = clietDAO;
    }

    @Override
    @Transactional
    public void addClient(Client client) {
        this.clietDAO.addClient(client);
    }

    @Override
    @Transactional
    public void updateClient(Client client) {
        this.clietDAO.updateClient(client);
    }

    @Override
    @Transactional
    public void removeClient(int id) {
        this.clietDAO.removeClient(id);
    }

    @Override
    @Transactional
    public Client getClientById(int id) {
        return this.clietDAO.getClientById(id);
    }

    @Override
    @Transactional
    public List<Client> getAllClients() {
        return this.clietDAO.getAllClients();
    }
    
}
