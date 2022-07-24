package LinkedList.LoveBabbar;

public class SinglyNode {
	
	public int data;
	public SinglyNode next;
	
	public SinglyNode(int data) {
		this.data = data;
		this.next = null;
	}
	
	@Override
	public String toString() {
		return ""+data+" - "+next;
	}

}
