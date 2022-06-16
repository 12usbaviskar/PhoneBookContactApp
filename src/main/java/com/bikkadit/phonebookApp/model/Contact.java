package com.bikkadit.phonebookApp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT_DTLS")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONTACTID")
	private Integer conmId;
	
	@Column(name = "CONTACT_NAME")
	private String conName;
	
	@Column(name = "CONTACT_NUMBER")
	private Long conNumber;
	
	@Column(name = "CONTACT_EMAIL")
	private String conEmail;
	
	@Column(name = "ACTIVE_SW")
	private Character activeSW;
	
	@Column(name = "CREATED_DATE") 
	private LocalDate createDate;
	
	@Column(name = "UPDATED_DATE")
	private LocalDate updateDate;

	public Integer getConmId() {
		return conmId;
	}

	public void setConmId(Integer conmId) {
		this.conmId = conmId;
	}

	public String getConName() {
		return conName;
	}

	public void setConName(String conName) {
		this.conName = conName;
	}

	public Long getConNumber() {
		return conNumber;
	}

	public void setConNumber(Long conNumber) {
		this.conNumber = conNumber;
	}

	public String getConEmail() {
		return conEmail;
	}

	public void setConEmail(String conEmail) {
		this.conEmail = conEmail;
	}

	public Character getActiveSW() {
		return activeSW;
	}

	public void setActiveSW(Character activeSW) {
		this.activeSW = activeSW;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Contact [conmId=" + conmId + ", conName=" + conName + ", conNumber=" + conNumber + ", conEmail="
				+ conEmail + ", activeSW=" + activeSW + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ "]";
	}
	
	
	
	
	
	

}
