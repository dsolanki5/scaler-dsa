package Stacks.LoveBabbarYT;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;

public class NextSmallerElemnt {
	
	public static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n) {
		Stack<Integer> st = new Stack<>();
        st.push(-1);
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=n-1; i>=0; i--) {
            int curr = arr.get(i);
            
            while(st.peek() >= curr ) {
                st.pop();
            }
            
            ans.add(st.peek());
            st.push(curr);
        }
        Collections.reverse(ans);
        return ans;
    }

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(7);
		ar.add(7);
		ar.add(1);
		ar.add(7);
		ar.add(1);
		//-1 1 1 -1 1 -1 
		//-1 1 1 1 7 1
		System.out.println(nextSmallerElement(ar, ar.size()));
	}

}
