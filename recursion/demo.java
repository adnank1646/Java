//To print from 0 to n using recursion


package recursion;

public class demo {
    public static void main(String[] args) {
        int n=0;
        print(n);
    }
    public static void print(int n){
        if(n==4){
            return;
        }
        System.out.println(n);
        n++;
        print(n); 
    }
}