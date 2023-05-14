package ch12;

public class Employee {
	
	private static int serialNum = 1000;
	
	private int empId;
	private String empName;
	private String department;
	
	public Employee() {
		serialNum++;
		empId = serialNum;
	}
	
	// static 메서드 안에서는 인스턴스 변수를 사용할 수 없다.
	// 인스턴스 변수가 생기기전에 static 변수가 생기므로 메모리 문제 발생
	public static int getSerialNum() {
		return serialNum;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
