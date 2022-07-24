package LinkedList.LoveBabbar;

public class CircularLL {
	static SinglyNode tail;
	
	public static void printCirLL(SinglyNode nodeTemp) {
		if(nodeTemp!=null && nodeTemp.next == nodeTemp) {
			System.out.print("<-"+nodeTemp.data+"->");
		}
		else if(nodeTemp != null) {
			nodeTemp = nodeTemp.next;
			do {
				System.out.print("-"+nodeTemp.data+"-");
				nodeTemp = nodeTemp.next;
			}while(nodeTemp != tail.next);
		}
		
		System.out.println();
	}
	
	public static void insertAtPos(int data, int pos) {
		SinglyNode node = new SinglyNode(data);
		
		if(pos == 1) {
			node.next = tail.next;
			tail.next = node;
			return;
		}
		
		int len = getLength();
//		System.out.println("len: "+len);
		
		//only 1 node or insert at end
		if(tail.next == tail || len+1 == pos) {
			node.next = tail.next;
			tail.next = node;
			tail=node;
			return;
		}
		
		SinglyNode temp=tail.next;
		int cnt=1;
		
		while(cnt < pos-1) {
			temp=temp.next;
			cnt++;
		}
		
		node.next = temp.next;
		temp.next = node;				
	}

	private static int getLength() {
		SinglyNode temp = tail.next;
		int len=1;
		while(temp != tail) {
			temp = temp.next;
			len++;
		}
		return len;
	}
	
	public static void deleteNode(int pos) {
		if(tail == null) {
			System.err.println("Linked List is empty!");
			return;
		}
		
		int len = getLength();
//		System.out.println("len: "+len);
		if(pos<=0 || pos>len) {
			System.err.println("Position doesnt exist!");
			return;
		}
		
		if(pos == len && tail.next == tail) {
			tail.next = null;
			tail = null;
			return;
		}
		
		if(pos == 1) {
			tail.next = tail.next.next;
			return;
		}
		
		int cnt=1;
		SinglyNode temp = tail.next;
		
		while(cnt < pos-1) {
			temp = temp.next;
			cnt++;
		}
		
		// if pos == last node
		if(pos == len) {
			temp.next = tail.next;
			tail = temp;
			return;
		}
		
//		System.out.println("<< "+temp.data);
		temp.next = temp.next.next;
		
	}

	public static void main(String[] args) {
		SinglyNode node = new SinglyNode(10);
		node.next = node;
		tail = node;
		printCirLL(tail);
		System.out.println();
		
		int data = 20, pos = 1;
		System.out.println("Inserting "+data+" at pos "+pos);
		insertAtPos(data, pos);
		printCirLL(tail);
		System.out.println("tail: "+tail.data);
		System.out.println();
		
		data=30; pos=2;
		System.out.println("Inserting "+data+" at pos "+pos);
		insertAtPos(data, pos);
		printCirLL(tail);
		System.out.println("tail: "+tail.data);
		System.out.println();
		
		data=15; pos=3;
		System.out.println("Inserting "+data+" at pos "+pos);
		insertAtPos(data, pos);
		printCirLL(tail);
		System.out.println("tail: "+tail.data);
		System.out.println();
		
		data=40; pos=5;
		System.out.println("Inserting "+data+" at pos "+pos);
		insertAtPos(data, pos);
		printCirLL(tail);
		System.out.println("tail: "+tail.data);
		System.out.println();
		
		// Deleting : 
		pos = 5;
		System.out.println("Deleting at pos "+pos);
		deleteNode(pos);
		printCirLL(tail);
		System.out.println("tail: "+tail.data);
		System.out.println();
		
		
	}

}
