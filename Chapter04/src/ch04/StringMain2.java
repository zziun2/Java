package ch04;

public class StringMain2 {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java)); //292938459
		
		java = java.concat(android);
		
		System.out.println(java); // javaandroid
		
		// String�� �����ϸ� ������ String�� ����Ǵ� ���� �ƴ� ���ο� ���ڿ��� ������ ( �޸� ���� �߻��� �� ����)
		System.out.println(System.identityHashCode(java)); //917142466
	}

}
