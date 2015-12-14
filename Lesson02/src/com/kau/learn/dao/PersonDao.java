package com.kau.learn.dao;

import com.kau.learn.domain.Person;

public interface PersonDao {
	public void create(Person person);
	public void delete(String personId);
	public Person read(String personId);
}
