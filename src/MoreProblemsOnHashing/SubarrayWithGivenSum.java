package MoreProblemsOnHashing;

import java.util.ArrayList;
import java.util.List;


class SubarrayWithGivenSum {
//42, 9, 38, 36, 48, 33, 36, 50, 38, 8, 13, 37, 33, 38, 17, 25, 50, 50, 41, 29, 34, 18, 16, 6, 49, 16, 21, 29, 41, 7, 37, 14, 5, 30, 35, 26, 38, 35, 9, 36, 34, 39, 9, 4, 41, 40, 3, 50, 27, 17, 14, 5, 31, 42, 5, 39, 38, 38, 47, 24, 41, 5, 50, 9, 29, 14, 19, 27, 6, 23, 17, 1, 22, 38, 35, 6, 35, 41, 34, 21, 30, 45, 48, 45, 37	
	public static ArrayList<Integer> solve(List<Integer> a, int B) {
        ArrayList<Integer> al = new ArrayList<>();
		int left=0, sum=0;
        for(int i=0; i<a.size(); i++) {
        	sum+=a.get(i);
        	al.add(a.get(i));
        	
        	while(sum > B) {
        		sum-=a.get(left);
        		left++;
        		al.remove(0);	
        	}
        	
        	if(sum == B) {
        		return al;
        	}
        	
        }
		al.clear();
        al.add(-1);
        return al;
    }

}
