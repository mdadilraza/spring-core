package spring_day6;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("lap.xml");
		 Store store  = (Store) beanFactory.getBean("store");
		 store.purchage();
	}

}
