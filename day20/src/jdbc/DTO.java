package jdbc;

public class DTO {	// Data Transfer Object, DB <-> Program 사이로 데이터를 주고받기 위해 사용하는 객체
					// DTO : 값을 저장하기 위한 객체 (값 중심)
	private String firstName;
	private int salary;

	public String getFirstName() {
	return firstName;
	}
	
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}
	
	public int getSalary() {
	return salary;
	}
	
	public void setSalary(int salary) {
	this.salary = salary;
	}

}
