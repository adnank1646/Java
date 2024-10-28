package LinearSearch1;


//search for the SMALLEST ELEMENT IN THE ARRAY
public class four {
    public static void main(String[] args) {
        int[] nums = {23,56,8,51,2,79};
        int ans = small(nums);
        System.out.println(ans);
    }
    static int small(int[] arr){
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<small){
                small=arr[i];
            }
        }
        return small;
    }
}
