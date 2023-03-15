package day02;

import java.util.Scanner;

public class SwitchCaseTest {
	// switch문
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt(); //월
		
		int day ;
		switch(month) {
			/*
			 * case 1, 3, 5, 7, 8, 10,12 -> {
			 * 	System.out.println("한 달은 31일입니다.");
			 * 	yield 31;	
			 * } case 2 -> 
			 * 	28;
			 *  default -> { ~
			 *  }
				로 Java14부터 변경 
			*/
			case 1: case 3: case 5:case 7: case 8: case 10: case 12:
				day = 31;
				break; // 안쓰면 계속 체크함
			case 2 : 
				day = 28;
				break; // 안쓰면 계속 체크함
			case 4 : case 6:case 9: case 11:
				day = 30;
				break; // 안쓰면 계속 체크함
			default :
				System.out.println("존재하지 않는 달입니다.");
				day = -1;
		}
		System.out.println(month + "월은 " + day + "일 입니다.");

	}

}
