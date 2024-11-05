package dto;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("anything.xml");
		Bottle bottle = (Bottle) beanFactory.getBean("bottle");
		System.out.println(bottle);
		System.out.println(bottle.getBottleId());
		System.out.println(bottle.getBottleBrand());
		System.out.println(bottle.getBottleColour());
		System.out.println(bottle.getBottlePrice());

		LipStick lipStick = (LipStick) beanFactory.getBean("lipStick");
		System.out.println(lipStick.getLipStrickId());
		System.out.println(lipStick.getLipStrickBrand());
		System.out.println(lipStick.getLipStrickPrice());
		System.out.println(lipStick.getLipStrickShade());

	}

}
