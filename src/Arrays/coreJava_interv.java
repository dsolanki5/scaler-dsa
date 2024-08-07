package Arrays;

import java.util.Arrays;

class A {
	public void m1() {
		System.out.println("A");
	}
}

class B extends A {
	public void m1() {
		System.out.println("B");
	}
}
public class coreJava_interv {
	
	public static void main(String[] args) {
//		A ob1 = new B();
//		ob1.m1();
		
//		stringToIntegerArray();
	}

	private static void stringToIntegerArray() {
		String a1b1 = "1234";
		int[] ans = new int[a1b1.length()];
		
		for(int i=0; i<a1b1.length(); i++) {
			System.out.println("cc:: "+a1b1.charAt(i));
			ans[i] = (a1b1.charAt(i) - '0');
			System.out.println("ans[i] :"+i+" : "+ans[i]);
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}
