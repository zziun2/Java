package ch02;

/*
 * LinkedList Ư¡
 * 	������ ������ Ÿ���� ������ ���� �����ϴ� �ڷ� ����
 * 	�ڷḦ �����ϴ� ��忡�� �ڷ�� ���� ��Ҹ� ����Ű�� ��ũ(������)�� ����
 * 	�ڷᰡ �߰� �ɶ� ��� ��ŭ�� �޸𸮸� �Ҵ� �ް� ���� ����� ��ũ�� ������ (������ ũ�Ⱑ ����)
 * 	���� ����Ʈ�� i ��° ��Ҹ� ã�°� �ɸ��� �ð��� ����� ������ ��� : O(n)
 * 	jdk Ŭ���� : LinkedList
 */
public class MyListNode {
	private String data; //�ڷ�
	public MyListNode next; //���� ��带 ����Ű�� ��ũ
	
	public MyListNode() {
		data = null;
		next = null;
	}
	
	public MyListNode(String data) {
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link) {
		this.data = data;
		this.next = link;
	}
	
	public String getData() {
		return data;
	}
}
