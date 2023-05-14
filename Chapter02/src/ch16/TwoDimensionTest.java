package ch16;

public class TwoDimensionTest {

	// 이차원 배열
	// 자료형[][] 배열이름 = new 자료형[행갯수][열갯수];
	// int[2][3] 은 아래와 같음.
	// [][][]
	// [][][]
	
	public static void main(String[] args) {
		int[][] arr = { {1,2,3}, {4,5,6,7}};
		int i, j;
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(", \t" + arr[i].length);
			System.out.println();
		}
	}

}
