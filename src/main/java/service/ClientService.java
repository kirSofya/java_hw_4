package service;

import com.sun.security.ntlm.Client;

import java.util.List;

public interface ClientService {

    void create(Client client) throws InterruptedException;

    List<Client> readAll();

    Client read(int id);

    boolean update(Client client, int id) throws InterruptedException;

    boolean delete(int id);
}

