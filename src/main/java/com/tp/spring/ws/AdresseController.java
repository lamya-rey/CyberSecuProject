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

import com.tp.spring.entity.Adresse;
import com.tp.spring.service.fascade.AdresseService;

@RestController
@RequestMapping(path= "/adresse")
public class AdresseController {

	@Autowired
	public AdresseService adresseService;

	@GetMapping("/{id}")
	public Adresse findById(@PathVariable Long id) {
		return adresseService.findById(id);
	}
	
	@GetMapping("/search/{libelle}")
	public Adresse findByLibelle(@PathVariable String libelle) {
		return adresseService.findByLibelle(libelle);
	}

	@DeleteMapping("/delete/{id}")
	public int deleteById(@PathVariable Long id) {
		return adresseService.deleteById(id);
	}

	@PostMapping("/save")
	public int save(@RequestBody Adresse adresse) {
		return adresseService.save(adresse);
	}

	
	@PutMapping("/update")
	public int update(@RequestBody Adresse adresse) {
		return adresseService.update(adresse);
	}

	@GetMapping("/")
	public List<Adresse> findAll() {
		return adresseService.findAll();
	}

}

