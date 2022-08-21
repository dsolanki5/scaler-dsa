package Stacks.LoveBabbarYT;

import java.util.Stack;

public class MaxRectangle {
	
	public int areaOfRectInRow(int[] ar) {
        int n = ar.length;
        int[] leftS = new int[n];
        int[] rightS = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<n; i++) {
            int curr = ar[i];
            while(!stack.isEmpty() && ar[stack.peek()] >= curr) {
                stack.pop();
            }
            
            if(stack.isEmpty()) {
                leftS[i] = 0;
            }
            else {
                leftS[i] = stack.peek()+1;
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            stack.pop();
        }
        
        for(int i=n-1; i>=0; i--) {
            int curr = ar[i];
            
            while(!stack.isEmpty() && ar[stack.peek()] >= curr) {
                stack.pop();
            }
            
            if(stack.isEmpty()) {
                rightS[i] = n-1;
            }
            else {
                rightS[i] = stack.peek()-1;
            }
            stack.push(i);
        }
        
        int area = 0;
        for(int i=0; i<n; i++) {
            area = Math.max(area, ar[i] * (rightS[i] - leftS[i] + 1));
        }
        
        return area;
    }
    
    public int maxArea(int M[][], int n, int m) {
        
        int maxArea = areaOfRectInRow(M[0]); //this method is largest area of rectangle in histogram
        
        for(int i=1; i<n; i++) {
            for(int j=0; j<m; j++) {
                
                if(M[i][j] != 0)
                {
                    M[i][j] = M[i][j] + M[i-1][j];
                }
                else {
                    M[i][j] = 0;
                }
            }
            
            maxArea = Math.max(maxArea, areaOfRectInRow(M[i]));
        }
        
        return maxArea;
    }

	public static void main(String[] args) {

	}

}
