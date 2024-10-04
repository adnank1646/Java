//Given an array arr, return the second largest distinct element from an array.
//If the second largest element doesn't exist then return -1.

//Input: arr = [12, 35, 1, 10, 34, 1]
//Output: 34
//Explanation: The largest element of the array is 35 and the second largest element is 34.


class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int large=Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        int ans = -1;
        for(int i=0 ; i<arr.length ; i++){
            if(ans<arr[i] && arr[i]<large){
                ans = arr[i];
            }
        }
        return ans;
    }
}