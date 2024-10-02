//You are given a number 'n'.
//Return number of digits in ‘n’.
//Example:
//Input: 'n' = 123
//Output: 3

package BasicMaths;

public class count {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(countDigits2(n));
    }

    public static int countDigits(int n){
        // Write your code here.
        int count = 0;
        while(n>0){
            int rem = n%10;
            count++;
            n = n/10;
        }
        return count;
    }


    //2nd Approach
    public static int countDigits2(int n){
        int count = (int)(Math.log10(n)+1); 
        return count;
    }


}