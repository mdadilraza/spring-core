package spring_day1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		
 BeanFactory beanFactory=new ClassPathXmlApplicationContext("Person.xml");
Person person =(Person) beanFactory.getBean("p1");
        
person.action();
Duster duster=(Duster) beanFactory.getBean("d2");
duster.use();
 College college = (College) beanFactory.getBean("clg");
 college.action();

	}

}
