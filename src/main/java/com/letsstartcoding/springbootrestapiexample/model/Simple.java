package com.letsstartcoding.springbootrestapiexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="simpleTable2")
public class Simple {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="simpleCol")
	private String simpleCol;
	
	@Column(name="simpleCol2")
	private String simpleCol2;

	public String getSimpleCol() {
		return simpleCol;
	}

	public String getSimpleCol2() {
		return simpleCol2;
	}

	public void setSimpleCol(String simpleCol) {
		this.simpleCol = simpleCol;
	}

	public void setSimpleCol2(String simpleCol2) {
		this.simpleCol2 = simpleCol2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
