package com.gazprombank.task1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gazprombank.task1.model.Client;
import com.gazprombank.task1.service.ClientService;

@Controller
public class ClientController {
    private ClientService clientservice;
    
    @Autowired(required = true)
    @Qualifier(value="clientService")
    public void setClientservice(ClientService clientservice) {
        this.clientservice = clientservice;
    }
    
    @RequestMapping(value="cliens", method = RequestMethod.GET)
    public String listClients(Model model){
        model.addAttribute("client", new Client());
        model.addAttribute("listClients", this.clientservice.getAllClients());
        return "clients";
    }
}
