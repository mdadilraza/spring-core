package conroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuration.Configuration1;

import dao.BusDao;
import dto.Bus;
import dto.Passenger;



public class SaveBoth {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration1.class);

		Bus bus = applicationContext.getBean("bus", Bus.class);
		Passenger passenger1 = applicationContext.getBean("passenger", Passenger.class);
		passenger1.setPassengerName("ajit");
		passenger1.setPassengerAge(23);
		Passenger passenger2 = applicationContext.getBean("passenger", Passenger.class);
		passenger2.setPassengerName("Manoj");
		passenger2.setPassengerAge(21);
		Passenger passenger3 = applicationContext.getBean("passenger", Passenger.class);
		passenger3.setPassengerName("KArim");
		passenger3.setPassengerAge(24);
		
		List<Passenger> passengers= new ArrayList<Passenger>();
		passengers.add(passenger1);
		passengers.add(passenger2);
		passengers.add(passenger3);

		bus.setPassengers(passengers);

		BusDao busDao = applicationContext.getBean("busDao", BusDao.class);

		busDao.saveBoth(bus);


	}

}
