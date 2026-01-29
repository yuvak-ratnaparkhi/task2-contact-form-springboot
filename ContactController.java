package com.example.contactapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.contactapp.entity.Contact;
import com.example.contactapp.repository.ContactRepository;

@RestController
@CrossOrigin("*")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    // Save contact
    @PostMapping("/submit")
    public Contact saveContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
               
    }

    // Fetch all contacts
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}
