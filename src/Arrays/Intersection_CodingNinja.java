package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_CodingNinja {
	
	public static ArrayList<Integer> findArrayIntersection(List<Integer> arr1, int n, List<Integer> arr2, int m)
	{
        int i=0, j=0;
		// Declare an array to store answer.
        ArrayList<Integer> ans = new ArrayList<Integer>();
		while(i<n && j<m) {
            if(arr1.get(i) == arr2.get(j)) {
                if(!ans.contains(arr1.get(i))) {
                    ans.add(arr1.get(i));
                }
                i++;
                j++;
            }
            else if(arr1.get(i) < arr2.get(j)) {
                i++;
            }
            else{
                j++;
            }
        }
        
        
        return ans;
	}
	
	public static void main(String[] args) {
		List<Integer> al1 = Arrays.asList(1 ,2 ,2 ,2 ,3 ,4);
		List<Integer> al2 = Arrays.asList(2 ,2 ,3 ,3);
		
		System.out.println(findArrayIntersection(al1, al1.size(), al2, al2.size()));
	}

}
