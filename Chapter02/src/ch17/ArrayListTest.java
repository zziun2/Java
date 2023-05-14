package ch17;

import java.util.ArrayList;
import ch16.Book;

public class ArrayListTest {

	// 객체 배열을 구현한 클래스 ArrayList (ava.util 패키지에서 제공)
	// ArrayList는 객체 배열을 좀더 효율적으로 관리하기 위해 자바에서 제공해 주는 클래스
	
	/*
	 * boolean add(E e)		: 요소 하나를 배열에 추가
	 * int size()			: 배열에 추가된 요소 전체 갯수 반환
	 * E get(int index)		: index 위치에 있는 요소 반환
	 * E remove(int index)	: index 위치에 있는 요소 값 제거, 그 값 반환
	 * boolean isEmpty()	: 배열이 비어있는지
	 */
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>(); // default 10개
		
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
		
		for (int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
