package spring_day4;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChocolateMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("choco.xml");
		Chocolate chocolate=(Chocolate) beanFactory.getBean("choco");
		System.out.println(chocolate.toString());
	}
	
}
