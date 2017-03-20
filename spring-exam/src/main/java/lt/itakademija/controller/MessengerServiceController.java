package lt.itakademija.controller;

import lt.itakademija.model.Id;
import lt.itakademija.model.command.CreateContact;
import lt.itakademija.model.command.CreateMessage;
import lt.itakademija.model.command.UpdateContact;
import lt.itakademija.model.query.Contact;
import lt.itakademija.model.query.Message;
import lt.itakademija.repository.MessengerRepository;
import lt.itakademija.repository.SequenceGeneratorImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
public class MessengerServiceController {

	
	private final MessengerRepository repository;
	@Autowired
	public MessengerServiceController(MessengerRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(value = "/webapi/messenger/contacts", method = RequestMethod.POST)
	@ApiOperation(value = "POST")
	@ResponseStatus(HttpStatus.CREATED)
	public Id createContact(@RequestBody CreateContact createContact) {
		Id id = new Id(repository.createContact(createContact));
		return id;
	}

	@RequestMapping(value = "/webapi/messenger/contacts", method = RequestMethod.GET)
	@ApiOperation(value = "GET")
	@ResponseStatus(HttpStatus.OK)
	public List<Contact> getContacts() {
		return repository.getContacts();
	}

	@RequestMapping(value = "/webapi/messenger/contacts/{contactId}", method = RequestMethod.GET)
	@ApiOperation(value = "GET")
	@ResponseStatus(HttpStatus.OK)
	public Contact getContact(@ApiParam(value = "id", required = true)@RequestParam Long contactId) {
		
		return repository.getContact(contactId);
	}

	@RequestMapping(value = "/webapi/messenger/contacts/{contactId}", method = RequestMethod.PUT)
	@ApiOperation(value = "update")
	@ResponseStatus(HttpStatus.OK)
	public void updateContact(@ApiParam(value = "ID", required = true) @RequestParam Long contactId,@RequestBody UpdateContact updateContact) {
		repository.updateContact(contactId, updateContact);
	}

	@RequestMapping(value = "/webapi/messenger/contacts/{contactId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "DELETE")
	@ResponseStatus(HttpStatus.OK)
	public void deleteContact(@ApiParam(value = " ID", required = true)@RequestParam Long contactId) {
		repository.deleteContact(contactId);
	}

	@RequestMapping(value = "/webapi/messenger/messages/{contactId}", method = RequestMethod.POST)
	@ApiOperation(value = "create message")
	@ResponseStatus(HttpStatus.CREATED)
	public Id createMessage(@RequestParam Long contactId,@RequestBody CreateMessage createMessage) {
		
		Id id = new Id(repository.createMessage(contactId, createMessage));
		return id;
	}

	@RequestMapping(value = "/webapi/messenger/messages/{contactId}", method = RequestMethod.GET)
	@ApiOperation(value = "GET")
	@ResponseStatus(HttpStatus.OK)
	public List<Message> getMessages(@RequestParam Long contactId) {
		return repository.getMessages(contactId);
	}

}
