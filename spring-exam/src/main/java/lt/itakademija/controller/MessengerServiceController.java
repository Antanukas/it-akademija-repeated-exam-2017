package lt.itakademija.controller;

import lt.itakademija.model.Id;
import lt.itakademija.model.command.CreateContact;
import lt.itakademija.model.command.CreateMessage;
import lt.itakademija.model.command.UpdateContact;
import lt.itakademija.model.query.Contact;
import lt.itakademija.model.query.Message;
import lt.itakademija.repository.MessengerRepository;

import java.util.List;

import org.springframework.stereotype.Controller;

/**
 * Created by mariusg on 2017.03.19.
 */
@Controller
public class MessengerServiceController {

    private final MessengerRepository repository;

    public MessengerServiceController(MessengerRepository repository) {
        this.repository = repository;
    }

    public Id createContact(CreateContact createContact) {
        throw new UnsupportedOperationException("not implemented");
    }

    public List<Contact> getContacts() {
        throw new UnsupportedOperationException("not implemented");
    	
    }

    public Contact getContact(Long contactId) {
        throw new UnsupportedOperationException("not implemented");
    }

    public void updateContact(Long contactId,
                              UpdateContact updateContact) {
        throw new UnsupportedOperationException("not implemented");
    }

    public void deleteContact(Long contactId) {
        throw new UnsupportedOperationException("not implemented");
    }

    public Id createMessage(Long contactId,
                            CreateMessage createMessage) {
        throw new UnsupportedOperationException("not implemented");
    }

    public List<Message> getMessages(Long contactId) {
        throw new UnsupportedOperationException("not implemented");
    }

}
