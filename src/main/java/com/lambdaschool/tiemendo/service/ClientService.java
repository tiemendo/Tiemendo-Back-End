package com.lambdaschool.tiemendo.service;

import com.lambdaschool.tiemendo.model.Client;

import java.util.ArrayList;

public interface ClientService
{

    ArrayList<Client> findAllClients();

    Client findClientById(long id);

    Client addNewClient (Client client);

    Client updateClient(Client client, long id);

    void deleteClient(long id);

}