package spring_day1;

public class Person {
	private int id;
	private  String name;
	 
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void action() {
		System.out.println("Person can eat , dance , sleep .....");
	}

}
