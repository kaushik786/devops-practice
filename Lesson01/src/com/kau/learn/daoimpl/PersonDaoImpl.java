package com.kau.learn.daoimpl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.kau.learn.dao.PersonDao;
import com.kau.learn.domain.Address;
import com.kau.learn.domain.Person;


// This is implementation class for PersonDao
public class PersonDaoImpl implements PersonDao {
	
	
	List<Person> persons = new ArrayList<Person>();
	
	public PersonDaoImpl() {
		initiate();
	}
	
	private void initiate()
	{
		Person kaushik = new Person();
		kaushik.setFirstName("Kaushik");
		kaushik.setLastName("Gattu");
		kaushik.setId("234");
		Calendar dob = Calendar.getInstance();
		dob.set(1991, 07, 16);
		kaushik.setDateOfBirth(dob);
		kaushik.setAddress(new Address("Line 1","Line 2","City","State","Country", "ZipCode") );
	
		persons.add(kaushik);
	}

	@Override
	public void create(Person person) {
		// TODO Auto-generated method stub
		persons.add(person);
	}


	@Override
	public void delete(String personId) {
		// TODO Auto-generated method stub
		for (Person person : persons)
		{
			if (person.getId().equals(personId))
			{
				persons.remove(person);
				break;
			}
		}
	}

	@Override
	public Person read(String personId) {
		// TODO Auto-generated method stub
		for (Person person : persons)
		{
			if (person.getId().equals(personId))
			{
				return person;
			}
		}
		return null;
	}
	
}
