package Stacks.LoveBabbarYT;

import java.util.Stack;

public class CeleberityProblem {
	
	//Function to find if there is a celebrity in the party or not.
    public int celebrity(int M[][], int n)
    {
    	Stack<Integer> stack = new Stack<>();
    	//push all celebs(indexs) into stack
    	for(int i=0; i<n; i++) {
    	    stack.push(i);
    	}
    	
    	//pop out two celebs and check who knows another,
    	// the one who dont know other has to be pushed back to stack
    	int x=-1, y=-1;
    	while(!stack.isEmpty() && stack.size() > 1) { //there must be min 2 celb in stack
    	    x = stack.pop(); // pop 1st celeb
    	    y = stack.pop(); // pop 2nd celeb
    	    
    	    if(M[x][y] == 1) { //means x know y, hence x cant be celeb
    	        stack.push(y); //
    	    }
    	    else {
    	        stack.push(x);
    	    }
    	    
    	}
    	
    	//now stack has only 1 elemnt i.e 1 celeb
    	//confirm is this is the right celeb
    	int celb = stack.pop();
    	boolean isCeleb = true;
    	
    	//celeb : is someone who dont know anyone i.e its row should have all 0's
    	for(int i=0; i<n; i++) {
    	    if(M[celb][i] != 0){
    	        isCeleb = false;
    	    }
    	}
    	
    	// Also celeb, is all other knows him.
    	//accept diagonal, all values in its columns must be 1
    	for(int i=0; i<n; i++) {
    	    if(i==celb){
    	        continue;
    	    }
    	    if(M[i][celb] != 1) {
    	        isCeleb = false;
    	    }
    	}
    	
    	if(isCeleb == false)
    	    return -1;
    	    
        return celb;
    }

	public static void main(String[] args) {
//		N = 3
//				M[][] = {{0 1 0},
//				         {0 0 0}, 
//				         {0 1 0}}

	}

}
