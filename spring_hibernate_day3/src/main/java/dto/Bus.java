package dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component

@Entity
public class Bus {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 
 private int busId;
 @Value("Volvo")
 private String busBrand;
 @Value("Green")
 private String busColor;
 @OneToMany(cascade = CascadeType.ALL)
 private List<Passenger> passengers;

public int getBusId() {
	return busId;
}

public void setBusId(int busId) {
	this.busId = busId;
}

public String getBusBrand() {
	return busBrand;
}

public void setBusBrand(String busBrand) {
	this.busBrand = busBrand;
}

public String getBusColor() {
	return busColor;
}

public void setBusColor(String busColor) {
	this.busColor = busColor;
}

public List<Passenger> getPassengers() {
	return passengers;
}

public void setPassengers(List<Passenger> passengers) {
	this.passengers = passengers;
}
 
}
