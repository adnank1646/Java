package LinearSearch1;


//1295. Find Numbers with Even Number of Digits
public class seven {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int ans = evenDigit(arr);
        System.out.println(ans);
    }
    static int evenDigit(int[] nums){
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count(nums[i])%2==0){
                total++;
            }
        }
        return total;
    }

    static int count(int n){
        int count=0;
        while(n>0) {
            count++;
            n=n/10;
        }
        return count;
    }
}
