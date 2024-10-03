//Given an integer, check whether it is a palindrome or not.

//Input: n = 555
//Output: Yes


class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int rev = 0;
        int dup = n;
        while(dup>0){
            int last = dup%10;
            rev = rev*10+last;
            dup = dup/10;
        }
        if(rev == n){
            return "Yes";
        }
        return "No";
    }
}