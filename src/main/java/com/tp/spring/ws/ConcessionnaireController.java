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

import com.tp.spring.entity.Concessionnaire;
import com.tp.spring.service.fascade.ConcessionnaireService;

@RestController
@RequestMapping(path = "/concessionnaire")
public class ConcessionnaireController {
	
	@Autowired
	public ConcessionnaireService concessionnaireService;
	
	@GetMapping("/{id}")
	public Concessionnaire findById(@PathVariable Long id) {
		return concessionnaireService.findById(id);
	}
	

	@GetMapping("/search/{libelle}")
	public Concessionnaire findByLibelle(@PathVariable String libelle) {
		return concessionnaireService.findByLibelle(libelle);
	}
	

	@DeleteMapping("/delete/{id}")
	public int deleteById(@PathVariable Long id) {
		return concessionnaireService.deleteById(id);
	}


	@PostMapping("/save")
	public int save(@RequestBody Concessionnaire concessionnaire) {
		return concessionnaireService.save(concessionnaire);
	}

	@PutMapping("/update")
	public int update(@RequestBody Concessionnaire concessionnaire) {
		return concessionnaireService.update(concessionnaire);
	}

	@GetMapping("/")
	public List<Concessionnaire> findAll() {
		return concessionnaireService.findAll();
	}

}

