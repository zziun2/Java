package ch08;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		//����� ������ ArrayList ����
		arrayList = new ArrayList<Member>();
	}
	
	// ArrayList�� ��� �߰�
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
		
		System.out.println(mId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
