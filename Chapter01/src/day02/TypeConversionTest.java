package day02;

public class TypeConversionTest {

	public static void main(String[] args) {
		byte a = 125;
		int b = a;
		System.out.println(b);
		
		int c = 255;
		byte d = (byte)c; // -1, 강제 캐스팅의 경우 값 변경됨
		System.out.println(d);

		double e = 3.14;
		int f = (int)e; // 3, 강제 캐스팅의 경우로 값 짤림
		System.out.println(f);
		
		double g = 1.2;
		float h = 0.9F;

		int i = (int)g + (int)h; // 1 + 0
		int j = (int)(g + h); // 2
		
		System.out.println(i);
		System.out.println(j);
	}

}
