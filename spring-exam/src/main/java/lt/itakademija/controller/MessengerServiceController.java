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

import javax.validation.Valid;
import java.util.List;

/**
 * Created by mariusg on 2017.03.19.
 */
@RestController
@RequestMapping(value = "/webapi/messenger")
@Api(value = "Messenger Service Controller")
public class MessengerServiceController {

    @Autowired
    private final MessengerRepository repository;

    public MessengerServiceController(MessengerRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/contacts")
    @ApiOperation(value = "Create contacts", notes = "Create contact.")
    @ResponseStatus(HttpStatus.OK)
    public boolean createContact(@Valid @RequestBody CreateContact createContact) {
        repository.createContact(createContact);
        return true;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/contacts")
    @ApiOperation(value = "Get contacts", notes = "Returns contacts.")
    @ResponseStatus(HttpStatus.OK)
    public List<Contact> getContacts() {
        return repository.getContacts();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/contacts/{contactId}")
    @ApiOperation(value = "Get contact by Id", notes = "Returns contact.")
    @ResponseStatus(HttpStatus.OK)
    public Contact getContact(@PathVariable Long contactId) {
        return repository.getContact(contactId);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/contacts/{contactId}")
    @ApiOperation(value = "Get contacts", notes = "Returns contacts.")
    @ResponseStatus(HttpStatus.OK)
    public void updateContact(@PathVariable Long contactId,
                              @Valid @RequestBody UpdateContact updateContact) {
        repository.updateContact(contactId, updateContact);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/contacts/{contactId}")
    @ApiOperation(value = "Delete contact", notes = "Deletes contact.")
    @ResponseStatus(HttpStatus.OK)
    public void deleteContact(@PathVariable Long contactId) {
       repository.deleteContact(contactId);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/messages/{contactId}")
    @ApiOperation(value = "Create Messsage", notes = "Creates Messsage.")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean createMessage(@PathVariable Long contactId,
                            @Valid @RequestBody CreateMessage createMessage) {
        repository.createMessage(contactId,createMessage);
        return true;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/messages/{contactId}")
    @ApiOperation(value = "Get Messsage", notes = "Returns Messsage.")
    @ResponseStatus(HttpStatus.OK)
    public List<Message> getMessages(@PathVariable Long contactId) {
       return repository.getMessages(contactId);
    }

}
