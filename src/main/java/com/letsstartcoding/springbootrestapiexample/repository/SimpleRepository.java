package com.letsstartcoding.springbootrestapiexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.letsstartcoding.springbootrestapiexample.model.Simple;

@Repository
public interface SimpleRepository extends JpaRepository<Simple, Integer> {
	
	@Query("select id,simpleCol,simpleCol2 from Simple where id=1")
	public Simple findSpecific();

}
