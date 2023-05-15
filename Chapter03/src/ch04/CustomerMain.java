package ch04;

public class CustomerMain {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + " 지불 금액은 " 
		+ priceLee + "원 입니다.");
		
		System.out.println(customerKim.showCustomerInfo() + " 지불 금액은 " 
		+ priceKim + "원 입니다.");
		
		Customer customerNa = new VIPCustomer(10030, "나몰라");
		customerNa.bonusPoint = 10000;
		int priceNa = customerNa.calcPrice(10000);
		System.out.println(customerNa.showCustomerInfo() + " 지불 금액은 "
				+ priceNa + "원 입니다."); 
	}

}
