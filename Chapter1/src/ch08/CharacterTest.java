package ch08;

public class CharacterTest {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2); // 데이터 타입인 char로 인식
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3); // 67
		System.out.println((char)ch3);
		
		char hangle = '한';
		char ch = '\uD55C'; // unicode, 16bit, 한
		
		System.out.println(hangle);
		System.out.println(ch);
	}

}
