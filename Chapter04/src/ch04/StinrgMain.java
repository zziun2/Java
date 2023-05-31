package ch04;

public class StinrgMain {

	// 힙 메모리는 생성될때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가짐
	public static void main(String[] args) {
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		
		System.out.println(str1 == str2); // false

		String str3 = "ABC";
		String str4 = "ABC";
		
		System.out.println(str3 == str4); // true
	}

}
