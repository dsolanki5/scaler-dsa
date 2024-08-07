package StringManipulation.LoveBabbarYT_DSA.Strings;

import java.util.Arrays;

public class StringPract {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "java";
		String s3 = new String("Java");
		String s4 = "java is l easy language";
		
//		indexOfStr(s4);
		//toCharArrayDemo(s2);
		charAtDemo(s4);

	}

	

	private static void charAtDemo(String s4) {
		for(int i=0;i<s4.length();i++) {
			//System.out.println(s4.charAt(i));
			System.out.println(+s4.charAt(i)+" : "+i);

			
		}
		
		
	}


//
//	private static void toCharArrayDemo(String s2) {
//		
//		char[] cAr = s2.toCharArray();
//		System.out.println(Arrays.toString(cAr));
//		
//		//
////		int[] noAr = {1,2,3,4,5};
//		int[] noAr = new int[5];
//		int v=1;
//		for(int i=0; i<noAr.length; i++) {
//			noAr[i] = v;
//			v++; //v=v+1
//		}
//		
//	}
//
//	private static void indexOfStr(String s) {	
//		
//		int a=s.indexOf('e');
//		System.out.println(a);
//		int b=s.indexOf("language");
//		System.out.println(b);
//		
//		boolean isContains = s.contains("is  ");
//		System.out.println(isContains);
//		
//		
//		
//	}
	
	

}
