package ch09;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		//멤버로 선언한 ArrayList 생성
		arrayList = new ArrayList<Member>();
	}
	
	// ArrayList에 멤버 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	/*
	 * 요소의 순회 : Iterator
	 * 	컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는것
	 * 	순서가 있는 List인터페이스의 경우는 Iterator를 사용 하지 않고 get(i) 메서드를 활용할 수 있음
	 * 	Set 인터페이스의 경우 get(i) 메서드가 제공되지 않으므로 Iterator를 활용하여 객체를 순회함
	 */
	public boolean removeMember(int mId) {
		Iterator<Member> ir = arrayList.iterator();
		// boolean hasNext() : 이후에 요소가 더 있는지를 체크하는 메서드, 요소가 있다면 true를 반환
		while(ir.hasNext()) {
			Member member = ir.next(); // 다음에 있는 요소를 반환
			int tempId = member.getmId();
			if (tempId == mId) {
				arrayList.remove(member);
				return true;
			}
		}
		
		System.out.println(mId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
