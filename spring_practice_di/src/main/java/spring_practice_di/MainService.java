package spring_practice_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainService {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Context.xml");
		
	ServiceLogic service	=applicationContext.getBean("serviceLogic" ,ServiceLogic.class);
	service.serviceProvider();
	}

}
