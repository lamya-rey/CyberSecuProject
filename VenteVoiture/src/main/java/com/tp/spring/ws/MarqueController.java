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

import com.tp.spring.entity.Marque;
import com.tp.spring.service.fascade.MarqueService;


@RestController
@RequestMapping(path = "/marque")
public class MarqueController {
	@Autowired
	public MarqueService marqueService;

	@GetMapping("/{id}")
	public Marque findById(@PathVariable Long id) {
		return marqueService.findById(id);
	}

	@GetMapping("/search/{libelle}")
	public Marque findByLibelle(@PathVariable String libelle) {
		return marqueService.findByLibelle(libelle);
	}

	@DeleteMapping("/delete/{id}")
	public int deleteById(@PathVariable Long id) {
		return marqueService.deleteById(id);
	}

	@PostMapping("/save")
	public int save(@RequestBody Marque marque) {
		return marqueService.save(marque);
	}

	@PutMapping("/update")
	public int update(@RequestBody Marque marque) {
		return marqueService.update(marque);
	}

	@GetMapping("/")
	public List<Marque> findAll() {
		return marqueService.findAll();
	}

}
