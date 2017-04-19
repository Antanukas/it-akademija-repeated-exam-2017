package lt.itakademija.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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

import java.util.List;

/**
 * Created by mariusg on 2017.03.19.
 */
@RestController
@RequestMapping(value = "/")
@Api(value = "Message Service Controller")
public class MessengerServiceController {

    @Autowired
    private final MessengerRepository repository;

    public MessengerServiceController(MessengerRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(value = "webapi/messenger/contacts", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Creates Contact", notes = "Returns created contact's id.")
    public Id createContact(@RequestBody CreateContact createContact) {
        return repository.createContact(createContact);
    }

    @RequestMapping(value = "webapi/messenger/contacts", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get contacts' list", notes = "Gets list of registered contacts")
    public List<Contact> getContacts() {
        return repository.getContacts();
    }

    @RequestMapping(value = "webapi/messenger/contacts/{contactId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get contact", notes = "Gets information for exact contact")
    public Contact getContact(@PathVariable Long contactId) {
        return repository.getContact(contactId);
    }

    @RequestMapping(value = "webapi/messenger/contacts/{contactId}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Update contact", notes = "Update information of the contact")
    public void updateContact(@PathVariable Long contactId,
                              @RequestBody UpdateContact updateContact) {
        repository.updateContact(contactId, updateContact);
    }

    @RequestMapping(value = "webapi/messenger/contacts/{contactId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Delete contact", notes = "Deletes exact contact")
    public void deleteContact(@PathVariable Long contactId) {
        repository.deleteContact(contactId);
    }

    @RequestMapping(value = "/webapi/messenger/messages/{contactId}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create message", notes = "Returns created message")
    public Id createMessage(@PathVariable Long contactId,
                              @RequestBody CreateMessage createMessage) {
        return repository.createMessage(contactId, createMessage);
    }

    @RequestMapping(value = "/webapi/messenger/messages/{contactId}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get messages", notes = "Gets list of all messages for exact contact")
    public List<Message> getMessages(@PathVariable Long contactId) {
        return repository.getMessages(contactId);
    }

}
