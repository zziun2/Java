package ch18;

import java.util.ArrayList;

public class Student {
	int sId;
	String sName;
	ArrayList<Subject> subjectList;
	
	public Student(int sId, String sName) {
		this.sId = sId;
		this.sName = sName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String subName, int score) {
		Subject subject = new Subject();
		
		subject.setSubName(subName);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject sub : subjectList) {
			total += sub.getScore();
			System.out.println("학생 " + sName + "의 " + sub.getSubName() 
				+ " 과목의 성적은 " + sub.getScore() + "점 입니다.");
		}
		
		System.out.println("학생 "+ sName + "의 총 점은 " + total + "점 입니다.");
	}
	
}
