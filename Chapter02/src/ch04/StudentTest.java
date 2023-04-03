package ch04;

public class StudentTest {

	public static void main(String[] args) {
		// 기본 생성자를 만들지 않으면 
		// Student studentLee = new Student(); 에러
		Student studentLee = new Student();
		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(1004, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());
	}

}
