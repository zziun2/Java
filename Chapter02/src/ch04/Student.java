package ch04;

public class Student {
	public int studentNumber; 
	public String studentName;
	public int grade;
	
	
	// default 생성자
	// 클래스에 생성자를 따로 구현하면 기본 생성자 (default constructor)는 제공되지 않음
	public Student() {
		
	}
	
	public Student(int studentNumber, String studentName, int grade) {
		System.out.println("student 생성");
		
		//studentNumber = studentNumber; 는 잘못된 경우
		// 변수 이름을 다르게 하거나, this를 꼭 써야한다. (보통은 같게 함)
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		// 초기화를 하지 않으면, 문자형은 null 숫자형은 int로 초기화
		
		return studentName + "학생의 학번은 " + studentNumber
				+ "이고, " + grade + "학년 입니다.";
	}
}
