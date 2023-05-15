package ch01;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		
		customerLee.setcName("이순신");
		customerLee.setcId(10010);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		
		customerKim.setcName("김유신");
		customerKim.setcId(10020);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
