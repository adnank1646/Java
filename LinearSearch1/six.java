package LinearSearch1;

import java.util.Arrays;

//maximum in the 2D Array
public class six {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,199,34,56},
            {18,12}
        };
        int ans = max2d(arr);
        System.out.println(ans);
    }

    static int max2d(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

}

