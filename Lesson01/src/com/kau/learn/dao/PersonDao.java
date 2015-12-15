package com.kau.learn.dao;

import com.kau.learn.domain.Person;

// I'm adding my comment
public interface PersonDao {
	public void create(Person person);
	public void delete(String personId);
	public Person read(String personId);
}
