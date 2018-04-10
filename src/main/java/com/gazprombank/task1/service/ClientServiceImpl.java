package com.gazprombank.task1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gazprombank.task1.dao.ClientDAO;
import com.gazprombank.task1.model.Client;

@Service
public class ClientServiceImpl  implements ClientService{

    private ClientDAO clientDAO;

    @Autowired
    public void setClientDAO(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @Override
    @Transactional
    public void addClient(Client client) {
        this.clientDAO.addClient(client);
    }

    @Override
    @Transactional
    public void updateClient(Client client) {
        this.clientDAO.updateClient(client);
    }

    @Override
    @Transactional
    public void removeClient(int id) {
        this.clientDAO.removeClient(id);
    }

    @Override
    @Transactional
    public Client getClientById(int id) {
        return this.clientDAO.getClientById(id);
    }

    @Override
    @Transactional
    public List<Client> getAllClients() {
        return this.clientDAO.getAllClients();
    }
    
}
