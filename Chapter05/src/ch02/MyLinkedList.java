package ch02;

public class MyLinkedList {
	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement(String data) {
		MyListNode newNode;
		
		// 맨 처음일 경우
		if(head==null) {
			newNode = new MyListNode(data);
			head = newNode;
		} else {
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while(temp.next != null) // 맨 뒤로 이동
				temp = temp.next;
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data) {
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if(position<0 || position>count) {
			System.out.println("추가할 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
			return null;
		}
		
		// 맨 앞으로 들어가는 경우
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			MyListNode preNode = null;
			for(i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode removeElement(int position) {
		int i;
		MyListNode tempNode = head;
		
		if(position>=count) {
			System.out.println("삭제할 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
			return null;
		}
		
		// 맨 앞을 삭제하는
		if(position == 0) {
			head = tempNode.next;
		} else {
			MyListNode preNode = null;
			for(i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "번 째 항목 삭제 되었습니다.");
		
		return tempNode;		
	}
	
	public String getElement(int position) {
		int i;
		MyListNode tempNode= head;
		
		if(position>=count) {
			System.out.println("검색 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
			return new String("error");
		}
		
		// 맨 앞인 경우
		if(position==0 ) { 
			return head.getData();
		} 
		
		for(i=0; i<position; i++) {
			tempNode = tempNode.next;
		}
		
		return tempNode.getData();
	}
	
	public MyListNode getNode(int position) {
		int i;
		MyListNode tempNode = head;
		
		if(position >= count) {
			System.out.println("검색 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
			return null;
		}
		
		// 맨 앞인 경우
		if(position == 0) {
			return head;
		}
		
		for(i=0; i<position; i++) {
			tempNode = tempNode.next;
		}
		
		return tempNode;
	}
	
	public void removeAll() {
		head = null;
		count = 0;
	}
	
	public int getSize() {
		return count;
	}
	
	public void printAll() {
		if(count==0) { 
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.next;
			if(temp != null) {
				System.out.println(" -> ");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty() {
		if(head==null) return true;
		else return false;
	}
}
