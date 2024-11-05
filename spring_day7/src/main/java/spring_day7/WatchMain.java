package spring_day7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WatchMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Anything.class);
		Watch watch = applicationContext.getBean("watch", Watch.class);
		watch.use();

	}

}
