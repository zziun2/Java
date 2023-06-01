package ch12;

import java.util.HashMap;
import java.util.Iterator;

/*
 * HashMap 
 * 	���� ���� ���Ǵ� Map �������̽� ��� Ŭ����
 * 	key - value�� ������ �����ϴ� �޼��带 ������
 * 	�˻��� ���� �ڷᱸ��
 *	key�� �̿��Ͽ� ���� �����ϰ� key�� �̿��Ͽ� ���� �������� ��� - hash �˰������� ���� ��
 * 	key�� �Ǵ� ��ü�� �ߺ��� �� ���� ��ü�� ���ϼ��� �񱳸� ���� equals()�� hashCode() �޼��带 �����ؾ� ��
 */

/*
 * TreeMap
 * 	Map �������̽��� ������ Ŭ�����̰� key�� ���� ������ ������ �� ����
 * 	key�� �Ǵ� Ŭ������ Comparable�̳� Comparator�������̽��� ���������ν�,
 *  	key-value ���� �ڷḦ key�� �������� �����Ͽ� ���� �� �� ����
 */
public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getmId(), member);
	}
	
	public boolean removeMember(int mId) {
		if(hashMap.containsKey(mId)) {
			hashMap.remove(mId);
			return true;
		}
		
		System.out.println(mId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
