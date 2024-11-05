package dto;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int studentId;
	private String studentName;
	private int studentRollNo;
	
	private Address address;
	
	

	public Student(int studentId, String studentName, int studentRollNo, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.address = address;
	}
//public Student() {
//	// TODO Auto-generated constructor stub
//}
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentRollNo=" + studentRollNo
				+ ", address=" + address + "]";
	}
	
	
	

}
