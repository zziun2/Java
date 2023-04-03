package day02;

public class NestedLoopTest {

	public static void main(String[] args) {
		int count = 1;
		
		for (int dan=2; dan<=9; dan++) {
			for(count=1; count<=9; count++) {
				System.out.println(dan+"X" + count + " = " + dan*count);
			}
			System.out.println();
		}
		
		
		int dan = 2;

		while (dan <= 9) {
			count = 1;
			while(count <= 9) {
				System.out.println(dan+"X" + count + " = " + dan*count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}

}
