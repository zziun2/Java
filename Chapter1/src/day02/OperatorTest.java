package day02;

public class OperatorTest {
	// 증가 감소 연산
	public static void main(String[] args) {
		int gameScore = 150;
		int lastScore = ++gameScore;
		System.out.println(lastScore); // 151
		System.out.println(gameScore); // 151
		
		gameScore = 150;
		lastScore = gameScore++;
		System.out.println(lastScore); // 150
		System.out.println(gameScore); // 151
	}
}
