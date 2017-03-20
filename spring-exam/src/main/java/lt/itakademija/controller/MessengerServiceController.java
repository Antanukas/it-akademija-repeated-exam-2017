package lt.itakademija.controller;

import lt.itakademija.model.Id;
import lt.itakademija.model.command.CreateContact;
import lt.itakademija.model.command.CreateMessage;
import lt.itakademija.model.command.UpdateContact;
import lt.itakademija.model.query.Contact;
import lt.itakademija.model.query.Message;
import lt.itakademija.repository.MessengerRepository;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * Created by mariusg on 2017.03.19.
 */
@RestController
@Api
@RequestMapping(value = "/webapi/messenger")
public class MessengerServiceController {

	private final MessengerRepository repository;

	@Autowired
	public MessengerServiceController(MessengerRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(value = "/webapi/messenger/contacts", method = RequestMethod.POST)
	@ApiOperation(value = "Create contact")
	@ResponseStatus(HttpStatus.CREATED)
	public Long createContact(@RequestBody CreateContact createContact) {
		return repository.createContact(createContact);
		// throw new UnsupportedOperationException("not implemented");
	}

	@RequestMapping(value = "/webapi/messenger/contacts", method = RequestMethod.GET)
	@ApiOperation(value = "Get contacts")
	@ResponseStatus(HttpStatus.OK)
	public List<Contact> getContacts() {
		return repository.getContacts();
		// throw new UnsupportedOperationException("not implemented");
	}

	@RequestMapping(value = "/webapi/messenger/contacts/{contactId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get contact by ID")
	@ResponseStatus(HttpStatus.OK)
	public Contact getContact(@PathVariable("contactId") Long contactId) {
		return repository.getContact(contactId);
		/// throw new UnsupportedOperationException("not implemented");
	}

	@RequestMapping(value = "/webapi/messenger/contacts/{contactId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update contact by ID")
	@ResponseStatus(HttpStatus.OK)
	public void updateContact(@PathVariable("contactId") Long contactId, @RequestBody UpdateContact updateContact) {
		repository.updateContact(contactId, updateContact);
		// throw new UnsupportedOperationException("not implemented");
	}

	@RequestMapping(value = "/webapi/messenger/contacts/{contactId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Contact")
	@ResponseStatus(HttpStatus.OK)
	public void deleteContact(@PathVariable("contactId") Long contactId) {
		repository.deleteContact(contactId);
		// throw new UnsupportedOperationException("not implemented");
	}

	@RequestMapping(value = "/webapi/messenger/messages/{contactId}", method = RequestMethod.POST)
	@ApiOperation(value = "Create message by ID")
	@ResponseStatus(HttpStatus.CREATED)
	public Long createMessage(@PathVariable("contactId") Long contactId, @RequestBody CreateMessage createMessage) {
		return repository.createMessage(contactId, createMessage);
		// throw new UnsupportedOperationException("not implemented");
	}

	@RequestMapping(value = "/webapi/messenger/messages/{contactId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get message by ID")
	@ResponseStatus(HttpStatus.OK)
	public List<Message> getMessages(@PathVariable("contactId") Long contactId) {
        return repository.getMessages(contactId);
		// throw new UnsupportedOperationException("not implemented");
	}

}
