package Arrays;

import java.util.Arrays;

public class MinNoOfPlatforms {
	
	//Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(double arr[], double dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int noOfPlatforms = 1; int total = 1;
		
		//sortAsPerArrivalTime(arr, dep, n);
		int i=1, j=0;
		while(i<n && j<n) {
			if(arr[i] > dep[j]) {
			    noOfPlatforms--;
				j++;
			}
			else {
				noOfPlatforms++;
				i++;
			}
			
			if(noOfPlatforms > total) {
			    total = noOfPlatforms;
			}
			
		}
		
		return total;
        
    }
	
	public static void main(String[] args) {
//		double arr[] = {9.00, 9.40, 9.50, 11.00, 15.00, 18.00}; 
//		double dep[] = {9.10, 12.00, 11.20, 11.30, 19.00, 20.00};
		// output : 3
		
		double arr[] = {9.00, 9.40}; 
		double dep[] = {9.10, 12.00};
				
		System.out.println(findPlatform(arr,dep, arr.length));

	}

}
