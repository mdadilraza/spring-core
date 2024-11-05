package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import dto.Person;

@Component
public class PersonDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();
//savePerson
	public void savePerson(Person person) {
		entityTransaction.begin();

		entityManager.persist(person);
		entityTransaction.commit();
	}
//deletePerson
	public void deletePerson(int id) {
		entityTransaction.begin();
		Person person = entityManager.find(Person.class, id);
		entityManager.remove(person);
		entityTransaction.commit();

	}
   //updatePerson
	
	public void updatePerson( int oldId , Person newPerson) {
	     newPerson.setPersonId(oldId);
		entityTransaction.begin();
		entityManager.merge(newPerson);
		entityTransaction.commit();
	}
}
