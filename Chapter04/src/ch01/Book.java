package ch01;

// �����Ϸ��� extends Object�� �߰���
public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// toString �޼��� ������
	public String toString() {
		return title + " , " + author;
	}
}
