package ch02;

public class Student {
	private int sId;
	private String sName;
	
	public Student(int sId, String sName) {
		this.sId = sId;
		this.sName = sName;
	}
	
	// ������ �� �ν��Ͻ��� �ּ� ���� ���Ͽ� true/false�� ��ȯ
	// ������
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if(this.sId == std.sId)
				return true;
			else return false;
		}
		return false;
	}
	
	// ������ �ν��Ͻ��� ���� �ּҸ� ��ȯ
	// ������
	public int hashCode() {
		return sId;
	}
}
