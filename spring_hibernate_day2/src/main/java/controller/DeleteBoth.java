package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.Configuration1;

import dao.HusbandDao;
import dto.Husband;

public class DeleteBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration1.class);
		Husband husband = applicationContext.getBean("husband", Husband.class);
		HusbandDao husbandDao = applicationContext.getBean("husbandDao", HusbandDao.class);
		
		husbandDao.deletePerson(1);
	}

}
