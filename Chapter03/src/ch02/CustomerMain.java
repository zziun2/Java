package ch02;

public class CustomerMain {

	// 하위 클래스 생성 시 상위 클래스가 먼저 생성됨
	// Customer() 생성자 호출 ->  VIPCustomer() 생성자 호출
	// 클래스가 상속 받은 경우 반드시 하위에서 상위의 생성자를 호출
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
