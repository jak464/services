package testproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testproject.cargos.Person;
import testproject.mappers.PersonMapper;

@Service
public class PersonService {
	
	@Autowired
	private PersonMapper mapper;
	
	public List<Person> getListOfPeople(){
		return mapper.selectPeople();
	}

}
