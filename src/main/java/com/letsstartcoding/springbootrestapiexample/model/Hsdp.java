package com.letsstartcoding.springbootrestapiexample.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="tblAberrometer")
//@EntityListeners(AuditingEntityListener.class)

public class Hsdp implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="abrID")
	private long abrID;
	
	@NotBlank
	@Column(name="abrSerialNumber")
	private String abrSerialNumber;
	
	@NotBlank
	@Column(name="abrIdentificationNumber")
	private String abrIdentificationNumber;
	
	@NotBlank
	@Column(name="abrSoftwareVersion")
	private String abrSoftwareVersion;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date abrCreatedWhen;
	
	private int abrGUID;
	
	

	public long getId() {
		return abrID;
	}

	public void setId(long abrID) {
		this.abrID = abrID;
	}

	public String getName() {
		return abrSerialNumber;
	}

	public void setName(String abrSerialNumber) {
		this.abrSerialNumber = abrSerialNumber;
	}

	public String getDesignation() {
		return abrIdentificationNumber;
	}

	public void setDesignation(String designation) {
		this.abrIdentificationNumber = designation;
	}

	public String getExpertise() {
		return abrSoftwareVersion;
	}

	public void setExpertise(String abrSoftwareVersion) {
		this.abrSoftwareVersion = abrSoftwareVersion;
	}

	public Date getCreatedAt() {
		return abrCreatedWhen;
	}

	public void setCreatedAt(Date abrCreatedWhen) {
		this.abrCreatedWhen = abrCreatedWhen;
	}

}
