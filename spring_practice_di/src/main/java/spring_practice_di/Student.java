package spring_practice_di;

public class Student {
	private int id;
	
	private MathCheating mathCheating ;
	
	public void setId(int id) {
		this.id  = id;
	}
	
	public void setMathCheating(MathCheating mathCheating) {
		this. mathCheating =  mathCheating;
	}
	
	
	public void cheating() {
		 mathCheating.mathCheating();
		
	}
	
	public Student() {
		System.out.println("constructor invoked ");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", mathCheating=" + mathCheating + "]";
	}
	
	

}
