package ch04;

public class StinrgMain {

	// �� �޸𸮴� �����ɶ����� �ٸ� �ּ� ���� ��������, ��� Ǯ�� ���ڿ��� ��� ���� �ּ� ���� ����
	public static void main(String[] args) {
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		
		System.out.println(str1 == str2); // false

		String str3 = "ABC";
		String str4 = "ABC";
		
		System.out.println(str3 == str4); // true
	}

}
