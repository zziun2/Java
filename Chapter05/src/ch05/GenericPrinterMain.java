package ch05;

/*
 * ���׸�(Generic)
 * 	Ŭ�������� ����ϴ� ������ �ڷ����� ������ �ϼ� �ְ�, �� ���(�޼���)�� ������ ��� Ŭ������ �ڷ����� Ư������ �ʰ�
 * 	���� �ش� Ŭ������ ����� �� ���� �� �� �ֵ��� ����
 * 	���� ���Ǵ� �ڷ����� ��ȯ�� �����Ϸ��� ���� �����ǹǷ� �������� ���α׷��� ���
 * 	�÷��� �����ӿ�ũ���� ���� ���ǰ� ����
 */

/*
 * ���̾Ƹ�� ������ <>
 * 	- ArrayList list = new ArrayList<>();  //���̾Ƹ�� ������ ���ο��� �ڷ����� �������� ��
 * 	- ���׸����� �ڷ��� �߷�(�ڹ� 10����)
 * 		ArrayList list = new ArrayList()  => var list = new ArrayList();
 */
public class GenericPrinterMain {

	public static void main(String[] args) {
		GenericPrinter<Powder> powerPrinter = new GenericPrinter<Powder>();
		powerPrinter.setMaterial(new Powder());
		System.out.println(powerPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);
	}

}
