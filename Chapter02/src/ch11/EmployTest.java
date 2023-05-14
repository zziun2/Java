package ch11;

public class EmployTest {

	public static void main(String[] args) {
		Employee empLee = new Employee();
		empLee.setEmpName("이순신");
		
		System.out.println(empLee.serialNum);	// 1000
		
		Employee empKim = new Employee();
		empKim.setEmpName("김유신");

		
		System.out.println(empLee.serialNum);	// 1001
		System.out.println(empKim.serialNum);	// 1001
		
	}

}
