// Check Prime
//Example :
//Input: 'n' = 5

//Output: YES

//Explanation: 5 is only divisible by 1 and 5. 2, 3 and 4 do not divide 5.

public class Solution {
	public static String isPrime(int num) {
		//Your code goes here
		int count = 0;
		for(int i=1 ; i<= Math.sqrt(num) ; i++){
			if(num%i == 0){
				count++;
				if((num/i)!=i){
					count++;
				}
			}
		}
		if(count==2){
			return "YES";
		}
		return "NO";
	}
}