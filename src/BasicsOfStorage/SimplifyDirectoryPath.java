package BasicsOfStorage;

import java.util.Arrays;

/**
 * Given a string A representing an absolute path for a file (Unix-style).
 * Return the string A after simplifying the absolute path.
 * 
 * Note: Absolute path always begin with '/' ( root directory ).
 * 		 Path will not have whitespace characters.
 * 
 * Input Format: The only argument given is string A.
 * Output Format: Return a string denoting the simplified absolue path for a file (Unix-style).
 * 
 * For Example: 
 * Input 1: A = "/home/"  Output 1: "/home"
 * Input 2: A = "/a/./b/../../c/"  Output 2: "/c"
 * 
 * @author Administrator
 *
 */
public class SimplifyDirectoryPath {
	
//	public static String simplifyPath(String A) {
//        String ans="/";
//        int n = A.length();
//        int i=n-1; int cnt=0;
//        while(i>0){
//            if(A.charAt(i) == '/' && A.charAt(i-1) == ' '){
////                ans+=A.substring(i+1,n-1);
//                continue;
//            }
//            else if(A.charAt(i) == '/' && i != n-1)
//                break;
//            else if(A.charAt(i) >= 'a' && A.charAt(i) <= 'z')
//                cnt++;
//            
//            i--;
//        }
//        if(cnt > 0)
//            return A.substring(i,n-1);
//        else
//            return ans;
//    }
	
	public static String simplifyPath(String A) {
        String ans = "/";
        String[] arr = A.substring(1, A.length()-1).split("/");
//        System.out.println(Arrays.toString(arr));
        if(arr.length == 1 && arr[0].matches("^[^..%$]..*$"))
        	return ans+=arr[0];
        
        for(int i=arr.length-1; i>0; i--) {
//        	System.out.println("=> "+arr[i]);
        	if(arr[i].equals("")) {
//        		System.out.println("xx");
        		ans = "/"+arr[i-1]+ans;
        		break;
        	}
        	else if(ans.length()==1 && arr[i].matches("^[^.%$]*$")) {
        		ans+=arr[i];
//        		System.out.println("-- "+ans);
        	}
        	else {
        		break;
        	}
        		
        }
//        
            return ans.trim();
    }

	public static void main(String[] args) {
//		String path = "/a/./b/../../c/"; // op: /c
//		String path = "/home/" ; //Output 1: "/home"
//		String path = "/home//foo/" ; //Output 1: "/home/foo" 
		String path = "/../" ; //Output 1: "/"
		
		System.out.println(":: "+simplifyPath(path));

	}

}
