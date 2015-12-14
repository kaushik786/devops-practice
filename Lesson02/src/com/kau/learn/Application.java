package com.kau.learn;

import com.kau.learn.daoimpl.PersonDaoImpl;
import com.kau.learn.domain.Person;

public class Application {
	public static void main(String args[])
	{
		PersonDaoImpl pdi = new PersonDaoImpl();
		Person person = pdi.read("234");
		if (person != null)
		{
			System.out.println("First Name is "+ person.getFirstName());
		} else {
			System.out.println("Database is empty");
		}
	}
}
