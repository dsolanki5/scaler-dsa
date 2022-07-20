package Recursions.KunalYT.subsetsubsequences;

import java.util.ArrayList;

public class DiceThrow {
	
	public static void solveDice(int target, String ans) {
		if(target == 0) {
			System.out.println(ans);
			return;
		}
		
		
		for(int i=1; i<=6; i++) {
			if(i<= target) {
				solveDice(target-i, ans+i);
			}
		}
	}
	
	public static ArrayList<String> solveDiceLst(int target, String ans) {
		if(target == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(ans);
			return list;
		}
		
		ArrayList<String> l = new ArrayList<String>();
		
		for(int i=1; i<=6; i++) {
			if(i <= target)
			{
				l.addAll(solveDiceLst(target-i, ans+i));
			}
		}
		return l;
	}
	
	public static ArrayList<String> solveDiceLstWithFace(int target, String ans, int noOffaces) {
		if(target == 0) {
			ArrayList<String> list = new ArrayList<>();
			list.add(ans);
			return list;
		}
		
		ArrayList<String> l = new ArrayList<String>();
		
		for(int i=1; i<=noOffaces; i++) {
			if(i <= target)
			{
				l.addAll(solveDiceLstWithFace(target-i, ans+i, noOffaces));
			}
		}
		return l;
	}

	public static void main(String[] args) {
		solveDice(4, "");
		System.out.println("Using List: "+solveDiceLst(4, ""));
		System.out.println("Using No Of Dice Faces: ");
		int noOfFaces = 8;
		System.out.println(solveDiceLstWithFace(4, "", noOfFaces));

	}

}
