package ch10;

public class CarMain {

	public static void main(String[] args) {
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("=====================");
		
		Car mCar = new ManualCar();
		mCar.run(); 
	}

}
