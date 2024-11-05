package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.PersonDao;
import dto.Configuration1;
import dto.Person;

public class UpdatePerson {

	public static void main(String[] args) {
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Configuration1.class);
		
		Person person	=applicationContext.getBean("person",Person.class);
		PersonDao personDao= applicationContext.getBean("personDao", PersonDao.class);
		personDao.updatePerson(1,person);


	}

}
