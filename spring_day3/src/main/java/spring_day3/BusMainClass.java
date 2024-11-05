package spring_day3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusMainClass {
	public static void main(String[] args) {
		BeanFactory beanFactory= new ClassPathXmlApplicationContext("Bus.xml");
	Bus bus	=(Bus) beanFactory.getBean("bus");
//	System.out.println(bus.getBusId());
//	System.out.println(bus.getBusName());
//	System.out.println(bus.getBusColor());
//	System.out.println(bus.getBusPrice());
//	System.out.println(bus.getBusNumber());
	
	System.out .println(bus);
	
	}

}
