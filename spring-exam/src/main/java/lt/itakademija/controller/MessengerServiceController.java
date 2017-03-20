package lt.itakademija.controller;

import lt.itakademija.model.Id;
import lt.itakademija.model.command.CreateContact;
import lt.itakademija.model.command.CreateMessage;
import lt.itakademija.model.command.UpdateContact;
import lt.itakademija.model.query.Contact;
import lt.itakademija.model.query.Message;
import lt.itakademija.repository.MessengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @RequestMapping(value = "webapi/messenger/contacts", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Id createContact(@RequestBody CreateContact createContact) {
       
    	
    	
    	return new Id(repository.createContact(createContact));
        		
    }

    @RequestMapping(value = "webapi/messenger/contacts", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Contact> getContacts() {
        return repository.getContacts();
    }

    @RequestMapping(value = "webapi/messenger/contacts/{contactId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Contact getContact(@PathVariable Long contactId) {
        return repository.getContact(contactId);
    }

    @RequestMapping(value = "webapi/messenger/contacts/{contactId}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updateContact(@PathVariable Long contactId,
                              @RequestBody UpdateContact updateContact) {
        repository.updateContact(contactId, updateContact);
    }

    @RequestMapping(value = "webapi/messenger/contacts/{contactId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteContact(@PathVariable Long contactId) {
        repository.deleteContact(contactId);
    }

    @RequestMapping(value = "webapi/messenger/messages/{contactId}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Id createMessage(@PathVariable Long contactId,
                            @RequestBody CreateMessage createMessage) {
        return new Id(repository.createMessage(contactId, createMessage));
    }

    @RequestMapping(value = "webapi/messenger/messages/{contactId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Message> getMessages(@PathVariable Long contactId) {
        return repository.getMessages(contactId);
    }

}
