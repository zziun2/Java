package ch01;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		
		customerLee.setcName("�̼���");
		customerLee.setcId(10010);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer();
		
		customerKim.setcName("������");
		customerKim.setcId(10020);
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
