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

import com.tp.spring.entity.Voiture;
import com.tp.spring.service.fascade.VoitureService;

@RestController
@RequestMapping(path = "/voiture")
public class VoitureController {
	
	@Autowired
	public VoitureService voitureService;
	
	@GetMapping("/{id}")
	public Voiture findById(@PathVariable Long id) {
		return voitureService.findById(id);
	}
	
	@GetMapping("/client/{login}")
	public Voiture findByClientLogin(@PathVariable String login) {
		return voitureService.findByClientLogin(login);
	}
	
	@GetMapping("/marque/{libelle}")
	public List<Voiture> findByMarqueLibelle(@PathVariable String libelle) {
		return voitureService.findByMarqueLibelle(libelle);
	}
	

	@DeleteMapping("/delete/{id}")
	public int deleteById(@PathVariable Long id) {
		return voitureService.deleteById(id);
	}


	@PostMapping("/save")
	public int save(@RequestBody Voiture client) {
		return voitureService.save(client);
	}

	@PutMapping("/update")
	public int update(@RequestBody Voiture voiture) {
		return voitureService.update(voiture);
	}

	@GetMapping("/")
	public List<Voiture> findAll() {
		return voitureService.findAll();
	}

}