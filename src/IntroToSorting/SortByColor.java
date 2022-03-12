package IntroToSorting;

import java.util.Arrays;

/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
	Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
	Note: Using library sort function is not allowed.
	
	Input Format
	First and only argument of input contains an integer array A.
	Output Format
	Return an integer array in asked order
	
	Input 1 : A = [0 1 2 0 1 2] || Input 2: A = [0]
	Output 1: [0 0 1 1 2 2] || Output 2: [0]
 * 
 *
 */
public class SortByColor {
    public static int[] sortColors(int[] A) {
        if(A.length <= 1)
            return A;
        
        int cnt0 = 0; int cnt1 = 0; int cnt2 = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]==0)
                cnt0++;
            
            if(A[i] == 1)
                cnt1++;
                
            if(A[i] == 2)
                cnt2++;
        }
        
        int i=0;
        while(cnt0 > 0){
            A[i] = 0;
            i++;
            cnt0--;
        }
        
        while(cnt1 > 0){
            A[i] = 1;
            i++;
            cnt1--;
        }
        
        while(cnt2 > 0){
            A[i] = 2;
            i++;
            cnt2--;
        }
        
        return A;
    }

	public static void main(String[] args) {
		int[] A = {0, 1, 2, 0, 1, 2};
		System.out.println(Arrays.toString(sortColors(A)));
	}

}
