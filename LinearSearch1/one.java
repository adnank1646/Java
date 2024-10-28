package LinearSearch1;

public class one {
    public static void main(String[] args) {
        int[] nums = {23,56,8,51,2,79};
        int target = 8;
        int ans = linear(nums, target);
        System.out.println(ans);
    }

    //search in the array
    static int linear(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
