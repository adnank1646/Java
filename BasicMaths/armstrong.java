//Check Armstrong
//Input: n = 153
//Output: true
//Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. Hence answer is "true".

class Solution {
    static String armstrongNumber(int n) {
        // code here
        int ans = 0 ; 
        int dup = n;
        while(dup>0){
            int last = dup%10;
            ans = ans+last*last*last;
            dup = dup/10;
        }
        if(ans == n){
            return "true";
        }
        return "false";
    }
}