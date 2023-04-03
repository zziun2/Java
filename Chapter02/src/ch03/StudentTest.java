package ch03;

public class StudentTest {

	// 생성자와 오버로딩
	public static void main(String[] args) {
		
		// 참조변수 studentLee, studentKim
		Student studentLee = new Student();
		
		studentLee.studentId = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentId = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
	}

}
