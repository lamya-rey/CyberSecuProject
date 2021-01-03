package com.tp.spring.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.spring.entity.Client;
import com.tp.spring.service.fascade.ClientService;

@RestController
@RequestMapping(path = "/client")
public class ClientController {
	@Autowired
	public ClientService clientService;
	
	@GetMapping("/{id}")
	public Client findById(@PathVariable Long id) {
		return clientService.findById(id);
	}
	
	@GetMapping("/search/{login}")
	public Client findByLogin(@PathVariable String login) {
		return clientService.findByLogin(login);
	}
	

	@DeleteMapping("/delete/{id}")
	public int deleteById(@PathVariable Long id) {
		return clientService.deleteById(id);
	}


	@PostMapping("/save")
	public int save(@RequestBody Client client) {
		return clientService.save(client);
	}

	@PutMapping("/update")
	public int update(@RequestBody Client client) {
		return clientService.update(client);
	}

	@GetMapping("/")
	public List<Client> findAll() {
		return clientService.findAll();
	}

}