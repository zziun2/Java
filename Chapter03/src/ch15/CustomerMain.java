package ch15;

// ���� �ڵ带 ������ �ν��Ͻ� ������ ��츸 ȣ��Ǵ� ����Ʈ �޼����� ��� 
// �� ���� �������̽����� �ߺ��Ǹ� �����ϴ� Ŭ�������� �ݵ�� �����Ǹ� �ؾ� ��
public class CustomerMain {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.buy();
		c.sell();
		c.sayHello();
		
		Buy buyer = c;
		buyer.buy();
		
		Sell seller = c;
		seller.sell();
		
		buyer.order(); // customer order
		seller.order(); // customer order
		
	}
}
