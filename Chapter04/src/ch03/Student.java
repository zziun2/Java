package ch03;

public class Student implements Cloneable{
	
	private int sId;
	private String sName;
	
	public Student(int sId, String sName) {
		this.sId = sId;
		this.sName = sName;
	}

	// clone �޼���
	// �ش� Ŭ������ clone() �޼����� ����� ����Ѵٴ� �ǹ̷� cloneable �������̽��� ���
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
