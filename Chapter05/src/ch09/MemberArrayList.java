package ch09;

import java.util.ArrayList;
import java.util.Iterator;

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
	
	/*
	 * ����� ��ȸ : Iterator
	 * 	�÷��� �����ӿ�ũ�� ����� ��ҵ��� �ϳ��� ���ʷ� �����ϴ°�
	 * 	������ �ִ� List�������̽��� ���� Iterator�� ��� ���� �ʰ� get(i) �޼��带 Ȱ���� �� ����
	 * 	Set �������̽��� ��� get(i) �޼��尡 �������� �����Ƿ� Iterator�� Ȱ���Ͽ� ��ü�� ��ȸ��
	 */
	public boolean removeMember(int mId) {
		Iterator<Member> ir = arrayList.iterator();
		// boolean hasNext() : ���Ŀ� ��Ұ� �� �ִ����� üũ�ϴ� �޼���, ��Ұ� �ִٸ� true�� ��ȯ
		while(ir.hasNext()) {
			Member member = ir.next(); // ������ �ִ� ��Ҹ� ��ȯ
			int tempId = member.getmId();
			if (tempId == mId) {
				arrayList.remove(member);
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
