package LinkedList.LoveBabbar;

/**
 *  https://www.codingninjas.com/codestudio/problems/sort-linked-list-of-0s-1s-2s_1071937?leftPanelTab=0
 *  
 * @author Deepak Solanki
 *
 * @param <T>
 */

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
    
    @Override
    	public String toString() {
    	return ""+data+" - "+next;
    	}
}

public class Sort0s1s2s_LL {
	static Node<Integer> head;
	static Node<Integer> tail;
	
	static void insertAtLast(int data) {
		Node<Integer> temp = new Node<>(data);
		if(head == null) {
			head = temp;
			tail = temp;
			return;
		}
		Node<Integer> p = head;
		while(p.next != null) {
			p = p.next;
		}
		p.next = temp;
		tail=temp;
	}
	
	public static Node<Integer> sortList_Approach1(Node<Integer> head) {
        int zeroCnt = 0;
        int oneCnt = 0;
        int twoCnt = 0;
        Node<Integer> curr = head;
        
        while(curr != null) {
            if(curr.data == 0) {
                zeroCnt++;
            }
            else if(curr.data == 1) {
                oneCnt++;
            }
            else {
                twoCnt++;
            }
            curr = curr.next;
        }
        
        curr = head;
        while(curr != null) {
            if(zeroCnt > 0) {
                curr.data = 0;
                zeroCnt--;
            }
            else if(oneCnt > 0) {
                curr.data = 1;
                oneCnt--;
            }
            else if(twoCnt > 0) {
                curr.data = 2;
                twoCnt--;
            }
            curr = curr.next;
        }
        return head;
	}
	
	public static Node<Integer> sortList_Approach2(Node<Integer> head) {
		if(head == null) {
            return head;
        }
        Node<Integer> zeroHead = new Node<>(-1);
        Node<Integer> zeroTail = zeroHead;
        Node<Integer> oneHead = new Node<>(-1);
        Node<Integer> oneTail = oneHead;
        Node<Integer> twoHead = new Node<>(-1);
        Node<Integer> twoTail = twoHead;
        
        Node<Integer> curr = head;
        
        while(curr != null) {
            int value = curr.data;
            
            if(value == 0) {
                zeroTail.next = curr;
                zeroTail = curr;
            }
            else if(value == 1) {
                oneTail.next = curr;
                oneTail = curr;
            }
            else if(value == 2) {
                twoTail.next = curr;
                twoTail = curr;
            }
            
            curr = curr.next;
        }
        
        if(oneHead.next != null) {
            zeroTail.next = oneHead.next;
        }
        else {
            zeroTail.next = twoHead.next;
        }
        
        oneTail.next = twoHead.next;
        twoTail.next = null;
        
        return zeroHead.next; 
	}

	public static void main(String[] args) {
		int data = 0;
//		for(int i=1; i<=5; i++)
//		{
//			data+=10;
//			insertAtLast(data);
//		}
		insertAtLast(0);
		insertAtLast(2);
		insertAtLast(2);
		insertAtLast(1);
		insertAtLast(0);
		insertAtLast(2);
		insertAtLast(1);
		
		System.out.println(head);
		
		//Approach - 1 (Simple)
//		head = sortList_Approach1(head);
		
		//Approach - 2
		head = sortList_Approach2(head);
		
		System.out.println(head);

	}

}
