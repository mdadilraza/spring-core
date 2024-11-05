package spring_practice_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
      Student  student   = applicationContext.getBean("student" ,Student.class);
      student.cheating();
      System.out.println(student);
		
//	Student student = new Student();
//	MathCheating cheating = new MathCheating();
//	student.setId(10);
//	student.setMathCheating(cheating);
//	
//	System.out.println(student);
	}
	
	
	

}
