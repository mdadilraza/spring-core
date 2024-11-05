package spring_day2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		
		BeanFactory beanFactory= new ClassPathXmlApplicationContext("car.xml");
		Car mahindra= (Mahindra) beanFactory.getBean("mahi");
		mahindra.name();
		
	Car tata	=(Tata) beanFactory.getBean("tata");
	tata.name();

	}

}
