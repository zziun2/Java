package ch10;

import java.util.HashSet;

/*
 * HashSet Ŭ����
 * 	Set �������̽��� ������ Ŭ����
 * 	����� �ߺ� ���θ� üũ�ϱ� ���� �ν��Ͻ��� ���ϼ��� Ȯ���ؾ� ��
 * 	���ϼ� ������ ���� �ʿ信 ���� equals()�� hashCode()�޼��带 ��������
 */
public class HashSetMain {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("������"));
		hashSet.add(new String("�̼���"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		
		System.out.println(hashSet);
	}
}
