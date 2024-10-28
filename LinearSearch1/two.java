package LinearSearch1;

public class two {
    public static void main(String[] args) {
        String s = "Adnan";
        char c = 'd';
        boolean ans = linear(s, c);
        System.out.println(ans);
        
    }
    static boolean linear(String str, char c){
        if (str.length()==0) {
            return false;
        }
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i)==c){
                return true;
            }
        }
        return false;
    }
}
