package spring_day6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Hp  implements Laptop{

	@Override
	public void brand() {
		
		System.out.println("This is Hp Laptop ");
	}

	@Override
	public void ram() {
		System.out.println("ram mthod of hp ");
		
	}

}
