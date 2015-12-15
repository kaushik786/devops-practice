package com.kau.learn.dao;

import com.kau.learn.domain.Person;


// I'm adding my comment
// This is public Class
// This is new comment
public interface PersonDao {
	public void create(Person person);
	public void delete(String personId);
	public Person read(String personId);
}
