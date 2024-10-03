//Reverse a number 
//ex: 123 o/p:321


import java.util.* ;
import java.io.*; 

public class Solution {
	public static long reverseNumber(long n) {
		// Write your code here
		long rev = 0;
		while(n>0){
			long l = n%10;
			rev = rev*10 + l;
			n = n/10;
		}
		return rev;
	}

}
