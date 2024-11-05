package spring_day6;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Dell implements Laptop {

	@Override
	public void brand() {
		System.out.println("This is Dell laptop");
		
	}
	@Override
	public void ram() {
		System.out.println("This is Ram Dell laptop");
		
	}
}
