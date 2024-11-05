package spring_practice_di;

public class MissedCallService  implements Service{

	@Override
	public void service() {
		System.out.println("miss call alert service activated ..");
	}

}
