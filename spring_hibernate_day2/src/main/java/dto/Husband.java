package dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Husband {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private  int id;
 @Value("Kashif")
 private String  husbandName;
 @Value("26")
 private int husbandAge;
 @Value("500000")
 private double husbandSalary;
 @Value("Hyd")
 private String husbandAddress;
 @Value("7828282777")
 private long husbandPhone;
 @OneToOne(cascade=CascadeType.ALL)
private  Wife wife;

public Wife getWife() {
	return wife;
}

public void setWife(Wife wife) {
	this.wife = wife;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getHusbandName() {
	return husbandName;
}

public void setHusbandName(String husbandName) {
	this.husbandName = husbandName;
}

public int getHusbandAge() {
	return husbandAge;
}

public void setHusbandAge(int husbandAge) {
	this.husbandAge = husbandAge;
}

public double getHusbandSalary() {
	return husbandSalary;
}

public void setHusbandSalary(double husbandSalary) {
	this.husbandSalary = husbandSalary;
}

public String getHusbandAddress() {
	return husbandAddress;
}

public void setHusbandAddress(String husbandAddress) {
	this.husbandAddress = husbandAddress;
}

public long getHusbandPhone() {
	return husbandPhone;
}

public void setHusbandPhone(long husbandPhone) {
	this.husbandPhone = husbandPhone;
}
 
 
}
