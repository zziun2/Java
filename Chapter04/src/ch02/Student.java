package ch02;

public class Student {
	private int sId;
	private String sName;
	
	public Student(int sId, String sName) {
		this.sId = sId;
		this.sName = sName;
	}
	
	// 본래는 두 인스턴스의 주소 값을 비교하여 true/false를 반환
	// 재정의
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if(this.sId == std.sId)
				return true;
			else return false;
		}
		return false;
	}
	
	// 본래는 인스턴스의 저장 주소를 반환
	// 재정의
	public int hashCode() {
		return sId;
	}
}
