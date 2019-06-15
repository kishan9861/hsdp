package com.letsstartcoding.springbootrestapiexample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.letsstartcoding.springbootrestapiexample.dao.HsdpDAO;
import com.letsstartcoding.springbootrestapiexample.model.Hsdp;
import com.letsstartcoding.springbootrestapiexample.model.Simple;
import com.letsstartcoding.springbootrestapiexample.repository.SimpleRepository;

@RestController
@RequestMapping("/company")
public class HsdpController {

	@Autowired
	HsdpDAO hsdpDAO;
	
	@Autowired
	SimpleRepository simpleRepository;

	/* to save an HSDP data */
	@PostMapping("/tblAberrometer")
	public Hsdp createHsdp(@Valid @RequestBody Hsdp hsdp) {
		return hsdpDAO.save(hsdp);
	}

	/* get all HSDP data */
	@GetMapping("/tblAberrometer")
	public List<Hsdp> getAllEmployees() {
		
		return hsdpDAO.findAll();
	}

	/* get Hsdp by abrID */
	@GetMapping("/tblAberrometer/{id}")
	public ResponseEntity<Hsdp> getHsdpById(@PathVariable long id) {

		Hsdp hsdp = hsdpDAO.findOne(id);

		if (hsdp == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(hsdp);

	}

	/* update an hsdp by hsdpid */
	@PutMapping("/tblAberrometer/{id}")
	public ResponseEntity<Hsdp> updateHsdp(@PathVariable(value = "id") Long empid,
			@Valid @RequestBody Hsdp hsdpDetails) {

		Hsdp hsdp = hsdpDAO.findOne(empid);
		if (hsdp == null) {
			return ResponseEntity.notFound().build();
		}

		hsdp.setName(hsdpDetails.getName());
		hsdp.setDesignation(hsdpDetails.getDesignation());
		hsdp.setExpertise(hsdpDetails.getExpertise());

		Hsdp updatehsdp = hsdpDAO.save(hsdp);
		return ResponseEntity.ok().body(updatehsdp);

	}

	/* Delete an hsdp */
	@DeleteMapping("/tblAberrometer/{id}")
	public ResponseEntity<Hsdp> deletehsdp(@PathVariable(value = "id") Long abrID) {

		Hsdp hsdp = hsdpDAO.findOne(abrID);
		if (hsdp == null) {
			return ResponseEntity.notFound().build();
		}
		hsdpDAO.delete(hsdp);

		return ResponseEntity.ok().build();

	}
	
	@GetMapping("/simple")
	public List<Simple> getAllSimple() {
		
		return simpleRepository.findAll();
	}
	
	@GetMapping("/simple/{id}")
	public Simple getASimple(@PathVariable(value="id") int id) {
		
		return simpleRepository.findSpecific();
	}
	
	@PostMapping("/simple")
	public void createSimple(@RequestBody Simple simple) {
		simpleRepository.save(simple);
	}

}
