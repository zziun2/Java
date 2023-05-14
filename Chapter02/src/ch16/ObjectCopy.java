package ch16;

public class ObjectCopy {
	// 얕은 복사
	// 자바에서 제공되는 배열 복사 메서드
	// System.arrayCopy(src, srcPos, dest, destPos, length) 

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		System.out.println("== library ==");
		
		for(Book book : library) {
			System.out.println(book);
		}
		
		System.out.println("== copyLibrary ==");
		
		for(Book book : copyLibrary) {
			System.out.println(book);
		}
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나목");
		

		System.out.println("== library ==");
		
		for(Book book : library) {
			book.showInfo();
		}
		
		// 복사된 배열도 정보가 바뀜
		System.out.println("== copyLibrary ==");
		
		for(Book book : copyLibrary) {
			book.showInfo();
		}
	}
}
