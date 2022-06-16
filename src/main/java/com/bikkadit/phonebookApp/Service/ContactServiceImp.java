package com.bikkadit.phonebookApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadit.phonebookApp.Repository.ContactRepo;
import com.bikkadit.phonebookApp.model.Contact;

@Service
public class ContactServiceImp implements ContactServiceI{
	
	@Autowired
	private ContactRepo contactRepo;

	@Override
	public boolean saveContact(Contact contact) {
		Contact save = contactRepo.save(contact);
		if(save != null) {
			return true;
		}else {
		    return false;
		}
	}

}
