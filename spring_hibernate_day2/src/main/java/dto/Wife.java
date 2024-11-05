package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Wife {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Value("Mumtaz ")
	private String wifeName;
	@Value("22")
	private int wifeAge;
	@Value("40000")
	private double wifeSalary;
	@Value("UP")
	private String wifeAddress;
   @Value("8726266262")
	private long wifePhone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public int getWifeAge() {
		return wifeAge;
	}

	public void setWifeAge(int wifeAge) {
		this.wifeAge = wifeAge;
	}

	public double getWifeSalary() {
		return wifeSalary;
	}

	public void setWifeSalary(double wifeSalary) {
		this.wifeSalary = wifeSalary;
	}

	public String getWifeAddress() {
		return wifeAddress;
	}

	public void setWifeAddress(String wifeAddress) {
		this.wifeAddress = wifeAddress;
	}

	public long getWifePhone() {
		return wifePhone;
	}

	public void setWifePhone(long wifePhone) {
		this.wifePhone = wifePhone;
	}
	
	
}
