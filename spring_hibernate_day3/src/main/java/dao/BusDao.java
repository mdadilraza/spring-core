package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import dto.Bus;
import dto.Passenger;



@Component

public class BusDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();
//saveBoth
	public void saveBoth(Bus bus) {
		//List<Passenger > passengers =bus.getPassengers();
		entityTransaction.begin();
//		for(Passenger passenger:passengers)
//        entityManager.persist(passenger);
		entityManager.persist(bus);
		entityTransaction.commit();
	}
	
	public void deleteBoth(int id) {
	
	
	entityTransaction.begin();
	Passenger passenger	=entityManager.find(Passenger.class, id);
	entityManager.remove(passenger);
	entityTransaction.commit();
	}
}
