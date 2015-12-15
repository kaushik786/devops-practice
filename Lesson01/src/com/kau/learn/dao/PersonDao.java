package com.kau.learn.dao;

import com.kau.learn.domain.Person;

// This is public Class
public interface PersonDao {
	public void create(Person person);
	public void delete(String personId);
	public Person read(String personId);
}
