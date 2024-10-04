//Given an array, arr. The task is to find the largest element in it.
//Examples:
//Input: arr = [1, 8, 7, 56, 90]
//Output: 90
//Explanation: The largest element of the given array is 90.



class Solution {
    public static int largest(int[] arr) {
        // code here
        int max = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}