package day02;

import java.util.Scanner;

public class ConitionTest {

	public static void main(String[] args) {
		int max;
		System.out.println("두 수를 입력 받아 더 큰 수를 출력하세요.\n");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력1 : ");
		int num1 = scanner.nextInt();
		System.out.println("입력1 : ");
		int num2 = scanner.nextInt();

		// 삼항연산자
		max = (num1 > num2) ? num1 : num2;
		System.out.println(max);
		
	}

}
