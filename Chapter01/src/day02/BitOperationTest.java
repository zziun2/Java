package day02;

public class BitOperationTest {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 10;
		
		System.out.println(n1 | n2);
		System.out.println(n1 & n2);
		System.out.println(n1 ^ n2);
		System.out.println(n1); // 반

		System.out.println(n1 << 2); // 5의 2의 2승
		System.out.println(n1 <<= 2); // 대입연산자 추가
		System.out.println(n1); // 5 아닌 5*2^2

		System.out.println(n1>>1); // 5 아닌 5*2^1=10
		

	}

}
