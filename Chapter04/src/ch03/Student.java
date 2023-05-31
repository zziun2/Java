package ch03;

public class Student implements Cloneable{
	
	private int sId;
	private String sName;
	
	public Student(int sId, String sName) {
		this.sId = sId;
		this.sName = sName;
	}

	// clone 메서드
	// 해당 클래스의 clone() 메서드의 사용을 허용한다는 의미로 cloneable 인터페이스를 명시
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
