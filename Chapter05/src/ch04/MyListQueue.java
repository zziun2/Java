package ch04;

import ch02.MyListNode;
import ch02.MyLinkedList;

/*
 * Queue Ư¡
 * 	�� ��(front) ���� �ڷḦ �����ų� �����ϰ�, �� ��(rear)���� �ڷḦ �߰� ��
 * 	Fist In First Out (���Լ���) ����
 * 	�ϻ� ��Ȱ���� �Ϸķ� �� �� �ִ� ���
 * 	���������� �Էµ� �ڷḦ ������� ó���ϴµ� ���� ��� �Ǵ� �ڷᱸ��
 * 	�ݼ��Ϳ� ���� ���� ��ȭ, �޼��� ť � Ȱ���
 * 	jdk Ŭ���� : ArrayList
 */

interface IQueue {
	public void enQueue(String data);
	public String deQueue();
	public void printAll();
}

public class MyListQueue extends MyLinkedList implements IQueue {
	
	MyListNode front;
	MyListNode rear;
	
	public MyListQueue() {
		front = null;
		rear = null;
	}
	
	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		
		// ó�� �׸�
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		} else {
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() +  " added");
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		String data = front.getData();
		front = front.next;
		
		// ������ �׸�
		if(front==null) { 
			rear = null;
		}
		return data;
	}

	@Override
	public void printAll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		MyListNode temp = front;
		while(temp!= null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp != null) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
}
