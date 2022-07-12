package Leetcode.Medium;

public class Leetcode_904 {

	    public static int totalFruit(int[] fruits) {
	        int count1=0, count2=0, max=0;
	        int fruit1 = fruits[0];
	        count1++;
	        int fruit2 = -1;
	        
	        for(int i=1; i<fruits.length; i++) { //i=4.4
	            if(fruit1 == fruits[i]) { //fruit1=1,
	                count1++;   //1
	                continue;
	            }
	            else if(fruit2 == -1) { // fruit2=6
	                fruit2 = fruits[i];
	                count2++;   //2
	                continue;
	            }
	            else if(fruit2 == fruits[i]) {
	                count2++;
	                continue;
	            }
	            
	            max = Math.max(max,count1+count2); //3
	            
	            fruit1 = fruits[i-1]; //1
	            if(fruit1 == fruit2){
	                count1=count2;
	            }
	            else
	                count1=1;
	            
	            fruit2 = fruits[i]; //6
	            count2=1;
	        }
	        
	        max = Math.max(max, count1+count2);
	        
	        return max;
	        
	    }
	
	public static void main(String[] args) {
		int[] fruits = {1,0,0,0,1,0,4,0,4};
		System.out.println("Ans= "+totalFruit(fruits));
	}

}
