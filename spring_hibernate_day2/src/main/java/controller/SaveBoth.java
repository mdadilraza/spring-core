package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.Configuration1;

import dao.HusbandDao;
import dto.Husband;
import dto.Wife;

public class SaveBoth {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration1.class);

		Husband husband = applicationContext.getBean("husband", Husband.class);
		Wife wife = applicationContext.getBean("wife", Wife.class);

		husband.setWife(wife);

		HusbandDao husbandDao = applicationContext.getBean("husbandDao", HusbandDao.class);

		husbandDao.saveBoth(husband);

	}

}
