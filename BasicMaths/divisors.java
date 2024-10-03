//Given an integer N, print all the divisors of N in the ascending order.
//Input : 20
//Output: 1 2 4 5 10 20
//Explanation: 20 is completely divisible by 1, 2, 4, 5, 10 and 20.


class Solution {
    public static void print_divisors(int n) {
        // code here
        List<Integer> ans = new ArrayList<>();
        for(int i=1 ; i<=Math.sqrt(n) ;i++){
            if(n%i==0){
                ans.add(i);
                if((n/i)!=i){
                    ans.add(n/i);
                }
            }
        }
        Collections.sort(ans);
        for(Integer i:ans){
        System.out.print(i+" ");
        }
    }
}