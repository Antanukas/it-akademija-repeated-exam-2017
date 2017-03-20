package lt.itakademija.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lt.itakademija.model.Id;
import lt.itakademija.model.command.CreateContact;
import lt.itakademija.model.command.CreateMessage;
import lt.itakademija.model.command.UpdateContact;
import lt.itakademija.model.query.Contact;
import lt.itakademija.model.query.Message;
import lt.itakademija.repository.MessengerRepository;

/**
 * Created by mariusg on 2017.03.19.
 */

@RestController
@RequestMapping("/spring-exam/webapi/messenger")
public class MessengerServiceController {
//	http://localhost:8080/spring-exam/webapi/messenger/contacts"
	
    private final MessengerRepository repository;

    @Autowired
    public MessengerServiceController(MessengerRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/contacts")
    @ResponseStatus(HttpStatus.CREATED)
    public Id createContact(@Valid CreateContact createContact) {
    
    	Id id = new Id(repository.createContact(createContact));
    	return id;
    }
    
    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return repository.getContacts();
    }

    @GetMapping(value = "contacts/{contactId}", params={"contactId"})
    public Contact getContact(@Valid @PathVariable("contactId") Long contactId) {
        return repository.getContact(contactId);
    }

    @PutMapping(value = "contacts/{contactId}", params = {"contactId"})
    public void updateContact(@PathVariable Long contactId,
                              @Valid UpdateContact updateContact) {
        repository.updateContact(contactId, updateContact);
    }

    @DeleteMapping(value = "contacts/{contactId}", params = {"contactId"})
    public void deleteContact(Long contactId) {
        repository.deleteContact(contactId);
    }

    public Id createMessage(Long contactId,
                            CreateMessage createMessage) {
        throw new UnsupportedOperationException("not implemented");
    }

    @GetMapping("/messages/{contactId}")
    public List<Message> getMessages(@Valid @PathVariable("contactId")Long contactId) {
        return repository.getMessages(contactId);
    }

}
