package ch05;

public class TestMethod {
	// �޼����� �̸��� �ּҰ��� ��Ÿ��
	// �ٸ� �ν��Ͻ��� ���� �޼��尡 ȣ���
	// �ν��Ͻ��� �����Ǹ� �� �޸𸮿� ���� ����������, �޼��� ��ɾ� set�� �� ���� �ε��
	// �� : a1�� num, a2�� num
	// ���� : a1, a2, args
	// �޼��� ���� : aaa() �޼��� ����
	int num;
	
	void aaa() {
		System.out.println("aaa() ȣ��");
	}

	public static void main(String[] args) {
		TestMethod a1 = new TestMethod();
		a1.aaa();
		
		TestMethod a2 = new TestMethod();
		a2.aaa();

	}
	
	// but, �����ǵ� ���� �����ǵ� �޼����� �ּҸ� ����Ŵ
	
}
