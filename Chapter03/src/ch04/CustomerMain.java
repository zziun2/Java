package ch04;

public class CustomerMain {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + " ���� �ݾ��� " 
		+ priceLee + "�� �Դϴ�.");
		
		System.out.println(customerKim.showCustomerInfo() + " ���� �ݾ��� " 
		+ priceKim + "�� �Դϴ�.");
		
		Customer customerNa = new VIPCustomer(10030, "������");
		customerNa.bonusPoint = 10000;
		int priceNa = customerNa.calcPrice(10000);
		System.out.println(customerNa.showCustomerInfo() + " ���� �ݾ��� "
				+ priceNa + "�� �Դϴ�."); 
	}

}
