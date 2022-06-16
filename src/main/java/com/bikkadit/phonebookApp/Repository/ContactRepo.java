package com.bikkadit.phonebookApp.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadit.phonebookApp.model.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Serializable> {
	
	

}
