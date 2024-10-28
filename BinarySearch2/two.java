package BinarySearch2;


//Binary Search for Order-Agonistic(Both order)
public class two {
    public static void main(String[] args) {
        int[] nums={12,9,6,4,1,-9};
        int target=4;
        int ans = orderAgno(nums, target);
        System.out.println(ans);
    }
    static int orderAgno(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        boolean isAsc = arr[start]<arr[end];
        while (start<=end) {
            int mid = start+(end-start)/2;

            if (arr[mid]==target) {
                return mid;
            }

            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }    
}
