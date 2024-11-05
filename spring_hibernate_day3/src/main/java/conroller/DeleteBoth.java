package conroller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.Configuration1;

import dao.BusDao;

public class DeleteBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration1.class);
		
		BusDao busDao = applicationContext.getBean("busDao", BusDao.class);
		busDao.deleteBoth(3);
	}

}
