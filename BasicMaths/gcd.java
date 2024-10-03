//GCD or HCF
//Example:
//Input: 'n' = 6, 'm' = 4
//Output: 2
//Explanation:
//Here, gcd(4,6) = 2, because 2 is the largest positive integer that divides both 4 and 6.




public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        while(n>0 && m>0){
            if(n>m){
                n = n%m;
            }
            else{
                m = m%n;
            }
        }
        if(m==0){
            return n;
        }
        return m;
    }
}