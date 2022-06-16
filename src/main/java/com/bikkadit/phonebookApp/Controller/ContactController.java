package com.bikkadit.phonebookApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.phonebookApp.Service.ContactServiceI;
import com.bikkadit.phonebookApp.model.Contact;

@RestController
public class ContactController {
	
	@Autowired
	private ContactServiceI contactServiceI;
	
	@PostMapping(value = "/saveContact" , consumes = "Application/json")
	public ResponseEntity<String> saveContact(Contact contact){
		
		boolean save = contactServiceI.saveContact(contact);
		
		if(save != true) {
			String msg ="Save Succesfully";
			return new ResponseEntity<String> ( msg , HttpStatus.OK);
		}else {
			String msg="Not successfully..";
			return new ResponseEntity<String>( msg , HttpStatus.BAD_REQUEST);
		}
		
		
		
	}

}
