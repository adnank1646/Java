package LinearSearch1;


//search in the RANGE OF INDEX
public class three {
    public static void main(String[] args) {
        int[] nums = {23,56,8,51,2,79};
        int target = 79;
        int ans = linearRange(nums, target, 1,4);
        System.out.println(ans);
        
    }
    static int linearRange(int[] arr, int target, int start , int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start ; i<=end ; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
