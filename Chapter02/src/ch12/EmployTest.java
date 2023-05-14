package ch12;

import ch12.Employee;

public class EmployTest {

	public static void main(String[] args) {
		
		// System.out.println(Employee.serialNum); 
		// private일 경우 error get으로 받아오기.
		System.out.println(Employee.getSerialNum()); 
		
		Employee empLee = new Employee();
		empLee.setEmpName("이순신");
		
		Employee empKim = new Employee();
		empKim.setEmpName("김유신");

		System.out.println(empLee.getEmpName() + "님의 사번은 " + empLee.getEmpId());
		System.out.println(empKim.getEmpName() + "님의 사번은 " + empKim.getEmpId());
	}

}
