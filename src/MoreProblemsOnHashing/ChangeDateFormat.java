package MoreProblemsOnHashing;

import java.text.DateFormatSymbols;
import java.util.HashMap;

/**
 * Given a date string in the format Day Month Year, where:

Day is in the set {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", ..., "29th", "30th", "31st"}.
Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
Year is in the inclusive range [1900, 3000].

Convert the date string to the format YYYY-MM-DD, where:

YYYY denotes the 4 digit year.
MM denotes the 2 digit month.
DD denotes the 2 digit day.
For example:

1st Mar 1984 :- 1984-03-01
23nd Feb 2013 :- 2013-02-022 
4th Apr 1900 :- 1900-04-04

**/
public class ChangeDateFormat {
	
	public String solve(String A) {
		HashMap<String,String> hm = new HashMap<>();
        
        for(int i=0;i<12;i++){
            String month = new DateFormatSymbols().getMonths()[i];
            String mnth = "";
            if(i+1 < 10)
                mnth = "0"+(i+1);
            else
                mnth += i+1;
                
            hm.put(month.substring(0,3),mnth);
        }
        
        String[] A_ar = A.split(" ");
        String date = "";
        
        for(int i=(A_ar[0]).length()-1;i>=0;i--) {
        	if(i == A_ar[0].length()-1 || i == A_ar[0].length()-2)
					continue;
					
        		date = A_ar[0].charAt(i)+date;     
        }
        if(date.length() < 2)
            date = "0"+date;
            
        String ans = A_ar[2]+"-"+hm.get(A_ar[1])+"-"+date;
        
        return ans;
    }

}
