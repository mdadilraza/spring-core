package dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bottle {
	@Value("1")
	private int bottleId;
	@Value("Milton")
	private String bottleBrand;
	@Value("200")
	private double bottlePrice;
	@Value("black")
	private String bottleColour;

	public int getBottleId() {
		return bottleId;
	}

	public String getBottleBrand() {
		return bottleBrand;
	}

	public double getBottlePrice() {
		return bottlePrice;
	}

	public String getBottleColour() {
		return bottleColour;
	}
	
	

}
