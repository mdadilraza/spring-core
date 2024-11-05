package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
  private int personId;
  @Value("Arfin")
  private String personName;
  @Value("BGP")
  private String personAddress;
  @Value("9707099098")
  private long personPhone;

public int getPersonId() {
	return personId;
}

public void setPersonId(int personId) {
	this.personId = personId;
}

public String getPersonName() {
	return personName;
}

public void setPersonName(String personName) {
	this.personName = personName;
}

public String getPersonAddress() {
	return personAddress;
}

public void setPersonAddress(String personAddress) {
	this.personAddress = personAddress;
}

public long getPersonPhone() {
	return personPhone;
}

public void setPersonPhone(long personPhone) {
	this.personPhone = personPhone;
}
  
  
}
