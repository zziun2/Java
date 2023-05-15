package ch10;

public abstract class Car {
	// abstract는 하위클래스에서 반드시 구현
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// abstract가 없으므로 하위에서 선언하지 않아도 됨.
	public void washCar() {}
	
	// 변하면 안되므로 final
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
