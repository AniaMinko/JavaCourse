package com.senla.bookshop.server.repositories;

import java.util.List;
import java.util.ArrayList;
import com.senla.bookshop.model.entity.Client;
import com.senla.bookshop.api.ireposotiry.IClientRepository;

public class ClientRepository implements IClientRepository {
	private static ClientRepository instance;
	private List<Client> clients;

	private ClientRepository() {
		clients = new ArrayList<Client>();
	}

	public static ClientRepository getInstance() {
		if (instance == null) {
			instance = new ClientRepository();
		}
		return instance;
	}

	@Override
	public List<Client> getClients() {
		return clients;
	}

	@Override
	public Client getClientById(Integer id) {
		return clients.get(id);
	}
}
