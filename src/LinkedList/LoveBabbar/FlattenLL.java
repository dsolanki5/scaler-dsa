package LinkedList.LoveBabbar;

/**
 * https://www.codingninjas.com/codestudio/problems/flatten-a-linked-list_1112655
 * 
 * @author Deepak Solanki
 *
 */
class NodeFlatten {
	int data;
	NodeFlatten next;
	NodeFlatten child;

	public NodeFlatten(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}
}

public class FlattenLL {
	
	public static NodeFlatten flattenLinkedList(NodeFlatten start) {
		if(start == null || start.next == null) {
            return start;
        }
        
        start = merge(start,flattenLinkedList(start.next));
        return start;
	}
    
    public static NodeFlatten merge(NodeFlatten left, NodeFlatten right) {
        NodeFlatten temp = new NodeFlatten(-1);
        NodeFlatten ans = temp;
        
        while(left != null && right != null) {
            if(left.data < right.data) {
                temp.child = left;
                left = left.child;
                temp = temp.child;
            }
            else {
                temp.child = right;
                right = right.child;
                temp = temp.child;
            }
        }
        
        if(left != null) {
            temp.child = left;
        }
        else {
            temp.child = right;
        }

        return ans.child;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
