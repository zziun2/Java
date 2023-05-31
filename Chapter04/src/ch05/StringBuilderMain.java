package ch05;

/*
	���������� �������� char[]�� ��� ������ ����
	���ڿ��� ������ �����ϰų� ������ �� ����ϸ� ������
	���ο� �ν��Ͻ��� �������� �ʰ� char[] �� ������
	StringBuffer�� ��Ƽ ������ ���α׷��ֿ��� ����ȭ(synchronization)�� ����
	���� ������ ���α׷������� StringBuilder ����� ����
	toString() �޼���� String��ȯ 
*/
public class StringBuilderMain {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		
		java = buffer.toString();
	}

}
