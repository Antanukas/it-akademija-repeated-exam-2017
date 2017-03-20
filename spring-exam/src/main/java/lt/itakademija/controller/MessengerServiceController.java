package lt.itakademija.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
public class MessengerServiceController {

	@Autowired
	private final MessengerRepository repository;

	public MessengerServiceController(MessengerRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(value = "webapi/messenger/contacts", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Long createContact(@RequestBody CreateContact createContact) {
		return repository.createContact(createContact);
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
	public void updateContact(@PathVariable Long contactId, @RequestBody UpdateContact updateContact) {
		repository.updateContact(contactId, updateContact);
	}

	@RequestMapping(value = "webapi/messenger/contacts/{contactId}",  method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteContact(@PathVariable Long contactId) {
		repository.deleteContact(contactId);
	}

	@RequestMapping(value = "webapi/messenger/messages/{contactId}",  method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Long createMessage(@PathVariable Long contactId, @RequestBody CreateMessage createMessage) {
		return repository.createMessage(contactId, createMessage);
	}

	@RequestMapping(value = "webapi/messenger/messages/{contactId}",  method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<Message> getMessages(@PathVariable Long contactId) {
		return repository.getMessages(contactId);
	}

}