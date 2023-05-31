package ch01;

// 컴파일러가 extends Object를 추가함
public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// toString 메서드 재정의
	public String toString() {
		return title + " , " + author;
	}
}
