package ch08;

import java.util.ArrayList;

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
	
	public boolean removeMember(int mId) {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getmId();
			if(tempId == mId) {
				arrayList.remove(i);
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
