package testproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import testproject.cargos.Person;
import testproject.services.PersonService;

@Controller
public class PersonController {

	@Autowired
	private PersonService service;
	
	@RequestMapping(path = "/people", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Person> getPeople() {
		return service.getListOfPeople();
	}
	
}
