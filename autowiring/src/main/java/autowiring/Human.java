package autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	private Heart heart;

	
	
	//@Autowired
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//		
//		System.out.println("setter method invoked ");
//	}
	
//	public Human() {
//		
//	}
	
	//@Autowired
	public Human(Heart heart) {
		
		this.heart = heart;
	}



	public void startPumping() {
		if(heart !=null)
		heart.pump();
		
		else 
			System.out.println("human is dead ");
	}

}
