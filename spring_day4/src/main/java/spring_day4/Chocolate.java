package spring_day4;

public class Chocolate {
   private int chocolateId;
   
   private String chocolateName;
   
   private double chocolatePrice;

public Chocolate(int chocolateId, String chocolateName, double chocolatePrice) {
	super();
	this.chocolateId = chocolateId;
	this.chocolateName = chocolateName;
	this.chocolatePrice = chocolatePrice;
}

@Override
public String toString() {
	return "Chocolate [chocolateId=" + chocolateId + ", chocolateName=" + chocolateName + ", chocolatePrice="
			+ chocolatePrice + "]";
}
   
   
}
