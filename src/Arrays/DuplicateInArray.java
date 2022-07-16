package Arrays;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class DuplicateInArray {
	
		public static int findDuplicate(List<Integer> arr) {

			int ans = 0;
	        
	        for(int i=0; i<arr.size(); i++) {
	            ans = ans^arr.get(i);
	        }
	        System.out.println("=1= "+ans);
	        
	        for(int i=1; i<arr.size(); i++) {
	            ans = ans^i;
	        }
	        
	        System.out.println("=2= "+ans);
	        
	        return ans;
		}
		
		public static void main(String[] args) {
			List<Integer> arr = Arrays.asList(1, 2, 3, 4, 4);
			
			System.out.println(findDuplicate(arr));
			
			TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
			
		}
	

}
