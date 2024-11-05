package spring_day7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Watch {
	@Value("1")
	private int watchId;
	@Value("Fossil")
	private String watchBrand;
   @Value("5000")
	private double watchPrice;
   
	private String watchType;
	
	public void use() {
		System.out.println("Watch is used to see the time");
	}

}