package BinarySearch2;


//704. Binary Search
public class one {
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        int target=9;
        int ans=binarySeach(nums, target);
        System.out.println(ans);
    }
    static int binarySeach(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            //find mid element
            int mid=start+(end-start)/2;
            if (target==arr[mid]) {
                return mid;                
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}