package dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LipStick {
	@Value("1")
 private int lipStrickId;
 @Value("Nykaa")
 private String lipStrickBrand;
 @Value("700")
 private double lipStrickPrice;
 @Value("Pink")
 private String lipStrickShade;

public int getLipStrickId() {
	return lipStrickId;
}

public String getLipStrickBrand() {
	return lipStrickBrand;
}

public double getLipStrickPrice() {
	return lipStrickPrice;
}

public String getLipStrickShade() {
	return lipStrickShade;
}
 
 
}
