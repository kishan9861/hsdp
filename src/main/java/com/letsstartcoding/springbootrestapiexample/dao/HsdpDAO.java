package com.letsstartcoding.springbootrestapiexample.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springbootrestapiexample.model.Hsdp;
import com.letsstartcoding.springbootrestapiexample.repository.HsdpRepository;

@Service
public class HsdpDAO {

	@Autowired
	HsdpRepository hsdpRepository;

	/* to save an the current table */

	public Hsdp save(Hsdp hsdp) {
		return hsdpRepository.save(hsdp);
	}

	/* search all table */

	public List<Hsdp> findAll() {
		return hsdpRepository.findAll();
	}

	/* get an table by id */
	public Hsdp findOne(long abrID) {
		//return hsdpRepository.findOne(abrID);
		return hsdpRepository.getOne(abrID);
	}

	/* delete an hsdp */

	public void delete(Hsdp hsdp) {
		hsdpRepository.delete(hsdp);
	}
	
	@Override
	public String toString() {
		return "";
		
	}

}
