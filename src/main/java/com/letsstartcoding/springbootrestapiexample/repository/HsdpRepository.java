package com.letsstartcoding.springbootrestapiexample.repository;

import com.letsstartcoding.springbootrestapiexample.model.Hsdp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HsdpRepository extends JpaRepository<Hsdp, Long> {

	//Hsdp findOne(long abrID);
	
	Hsdp getOne(long abrID);

}