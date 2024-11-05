package spring_practice_di;

public class ServiceLogic {
	
	private Service service;
	
	
	
	
	public void setService(Service service) {
		this.service = service;
	}




	public void serviceProvider()
	{
		service.service();
	}
}
