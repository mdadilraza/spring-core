package dto;

import org.springframework.stereotype.Component;
@Component
public class Address {
  private int houseNo;
  private String city;
  private int pincode;
  

public Address(int houseNo, String city, int pincode) {
	super();
	this.houseNo = houseNo;
	this.city = city;
	this.pincode = pincode;
}
public Address(int houseNo, String city) {
	super();
	this.houseNo = houseNo;
	this.city = city;
	
}

//public Address() {
//	// TODO Auto-generated constructor stub
//}
public int getHouseNo() {
	return houseNo;
}
public void setHouseNo(int houseNo) {
	this.houseNo = houseNo;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [houseNo=" + houseNo + ", city=" + city + ", pincode=" + pincode + "]";
}
  
  
}
