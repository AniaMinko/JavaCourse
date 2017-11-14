package com.senla.bookshop.api.ireposotiry;

import java.util.List;
import com.senla.bookshop.model.entity.Client;
public interface IClientRepository {

	List<Client> getClients();
	Client getClientById(Integer id);
}
