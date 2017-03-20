package lt.itakademija.controller;

import lt.itakademija.model.Id;
import lt.itakademija.model.command.CreateContact;
import lt.itakademija.model.command.CreateMessage;
import lt.itakademija.model.command.UpdateContact;
import lt.itakademija.model.query.Contact;
import lt.itakademija.model.query.Message;
import lt.itakademija.repository.MessengerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mariusg on 2017.03.19.
 */
@RestController
@RequestMapping(value = "/")
public class MessengerServiceController {

    @Autowired
    private final MessengerRepository repository;

    public MessengerServiceController(MessengerRepository repository) {
        this.repository = repository;
    }

    @PostMapping("webapi/messenger/contacts")
    @ResponseStatus(HttpStatus.CREATED)
    public Id createContact(@RequestBody CreateContact createContact) {
        //throw new UnsupportedOperationException("not implemented");
        return repository.createContact(createContact);
    }

    @GetMapping("webapi/messenger/contacts")
    @ResponseStatus(HttpStatus.OK)
    public List<Contact> getContacts() {
        //throw new UnsupportedOperationException("not implemented");
    	return repository.getContacts();
    	
    }
    @GetMapping("webapi/messenger/contacts/{contactId}")
    @ResponseStatus(HttpStatus.OK)
    public Contact getContact(@PathVariable Long contactId) {
    	return repository.getContact(contactId);
    }

    @PutMapping("webapi/messenger/contacts/{contactId}")
    @ResponseStatus(HttpStatus.OK)
    public void updateContact(@PathVariable Long contactId,
    						  @RequestBody UpdateContact updateContact) {
        //throw new UnsupportedOperationException("not implemented");
    	repository.updateContact(contactId, updateContact);
    }

    @DeleteMapping("webapi/messenger/contacts/{contactId}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteContact(@PathVariable Long contactId) {
    	repository.deleteContact(contactId);
    }

    @PostMapping("/webapi/messenger/messages/{contactId}")
    @ResponseStatus(HttpStatus.CREATED)
    public Id createMessage(@PathVariable  Long contactId,
    						@RequestBody CreateMessage createMessage) {
        //throw new UnsupportedOperationException("not implemented");
    	return repository.createMessage(contactId, createMessage);
        
    }
    
    @GetMapping("/webapi/messenger/messages/{contactId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Message> getMessages(@PathVariable Long contactId) {
    	return repository.getMessages(contactId);
    }

}
