package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import dto.Husband;
import dto.Wife;



@Component
public class HusbandDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("adil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();
//saveBoth
	public void saveBoth(Husband husband) {
	Wife wife	=husband.getWife();
		entityTransaction.begin();
        entityManager.persist(wife);
		entityManager.persist(husband);
		entityTransaction.commit();
	}
//deleteHusband
	public void deletePerson(int id) {
		entityTransaction.begin();
		Husband husband = entityManager.find(Husband.class, id);
		entityManager.remove(husband);
		entityTransaction.commit();

	}
}
