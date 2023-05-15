package ch10;

public abstract class Car {
	// abstract�� ����Ŭ�������� �ݵ�� ����
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	// abstract�� �����Ƿ� �������� �������� �ʾƵ� ��.
	public void washCar() {}
	
	// ���ϸ� �ȵǹǷ� final
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
