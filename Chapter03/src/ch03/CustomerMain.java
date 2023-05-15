package ch03;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		
		customerLee.setcName("이순신");
		customerLee.setcId(10010);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		// 묵시적 형 변환, 업캐스팅(역은 성립하지 않음)
		// customerKim은 Customer의 변수와 메서드만 접근 가능
		Customer customerKim = new VIPCustomer();
		
		customerKim.setcName("김유신");
		customerKim.setcId(10020);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
