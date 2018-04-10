package com.gazprombank.task1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.gazprombank.task1.model.Client;

@Repository
public class ClientDAOImpl implements ClientDAO{
    
    private SessionFactory sesssionFactory;
    
    public void setSesssionFactory(SessionFactory sesssionFactory) {
        this.sesssionFactory = sesssionFactory;
    }

    @Override
    public void addClient(Client client) {
        Session session = this.sesssionFactory.getCurrentSession();
        session.persist(client);
    }

    @Override
    public void updateClient(Client client) {
        Session session = this.sesssionFactory.getCurrentSession();
        session.update(client);
    }

    @Override
    public void removeClient(int id) {
        Session session = this.sesssionFactory.getCurrentSession();
        Client client = (Client) session.load(Client.class, new Integer(id));
        if(client != null){
            session.delete(client);
        }
    }

    @Override
    public Client getClientById(int id) {
        Session session = this.sesssionFactory.getCurrentSession();
        Client client = (Client) session.load(Client.class, new Integer(id));
        return client;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Client> getAllClients() {
        Session session = this.sesssionFactory.getCurrentSession();
        List<Client> allClients = session.createQuery("from CLIENT").list();
        return allClients;
    }
    
}
