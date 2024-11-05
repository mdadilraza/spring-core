package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int passengerId;
 
 private String passengerName;
 
 private int passengerAge;

public int getPassengerId() {
	return passengerId;
}

public void setPassengerId(int passengerId) {
	this.passengerId = passengerId;
}

public String getPassengerName() {
	return passengerName;
}

public void setPassengerName(String passengerName) {
	this.passengerName = passengerName;
}

public int getPassengerAge() {
	return passengerAge;
}

public void setPassengerAge(int passengerAge) {
	this.passengerAge = passengerAge;
}
 
 
}
