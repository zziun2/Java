package ch06;

public class Student {
	int stuId;
	String stuName;

	Subject korea;
	Subject math;
	
	Student(int stuId,String stuName) {
		this.stuId = stuId;
		this.stuName = stuName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subName  = name;
		korea.score = score;
	}
	

	public void setMathSubject(String name, int score) {
		korea.subName  = name;
		korea.score = score;
	}
	
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println(stuName + "학생의 총 점은 " + total + "점 입니다.");
	}
	
	
}
