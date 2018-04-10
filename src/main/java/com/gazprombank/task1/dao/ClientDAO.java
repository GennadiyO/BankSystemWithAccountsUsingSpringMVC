package com.gazprombank.task1.dao;

import java.util.List;

import com.gazprombank.task1.model.Client;

public interface ClientDAO {
    public void addClient(Client client);
    public void updateClient(Client client);
    public void removeClient(int id);
    public Client getClientById(int id);
    public List<Client> getAllClients();
}
