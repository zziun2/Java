package ch09;
// �߻� Ŭ���� : ���� �ڵ� ���� �޼����� ���� �ִ� �߻� �޼��带 ������ Ŭ����
// abstract �� ���� �� �ν��Ͻ�ȭ �� �� ����
public abstract class Computer {
	//�߻� �޼ҵ�
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
