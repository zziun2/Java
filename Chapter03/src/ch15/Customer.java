package ch15;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("customer buy");
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}

	// �ݵ�� ������
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("customer order");
	}

}
