package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import configure.Configure;
import dto.Student;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(Configure.class);
	Student student	= applicationContext.getBean("student",Student.class );
	System.out.println(student);
		
	}

}
