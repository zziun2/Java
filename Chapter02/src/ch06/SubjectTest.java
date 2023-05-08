package ch06;

public class SubjectTest {

	public static void main(String[] args) {
		Student stuLee = new Student(100, "LEE"); // 
		stuLee.setKoreaSubject("국어", 100);
		stuLee.setMathSubject("수희", 80);
		
		Student stuKim = new Student(100, "KIM"); // 
		stuKim.setKoreaSubject("국어", 100);
		stuKim.setMathSubject("수희", 99);
		
		stuLee.showScoreInfo();
		stuKim.showScoreInfo();
		
	}

}
