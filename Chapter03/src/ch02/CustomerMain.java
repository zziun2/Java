package ch02;

public class CustomerMain {

	// ���� Ŭ���� ���� �� ���� Ŭ������ ���� ������
	// Customer() ������ ȣ�� ->  VIPCustomer() ������ ȣ��
	// Ŭ������ ��� ���� ��� �ݵ�� �������� ������ �����ڸ� ȣ��
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
