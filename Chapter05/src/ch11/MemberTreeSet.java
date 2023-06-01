package ch11;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet 
 * 	��ü�� ���Ŀ� ����ϴ� Ŭ����
 * 	Set �������̽��� �����Ͽ� �ߺ��� ������� �ʰ�, ���������̳� ������������ ��ü�� ������ �� ����
 * 	���������� �����˻�Ʈ��(binary search tree)�� ������
 * 	�����˻�Ʈ���� �����ϱ� ���� �� ��ü�� ���ؾ� ��
 * 	�� ����� �Ǵ� ��ü�� Comparable�̳� Comparator �������̽��� ���� �ؾ� TreeSet�� �߰� �� �� ����
 * 	String, Integer�� JDK�� ���� Ŭ�������� �̹� Comparable�� ��������
 */
public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int mId) {
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getmId();
			if(tempId == mId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(mId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
