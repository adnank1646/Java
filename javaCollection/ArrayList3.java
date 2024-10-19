package javaCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {
    public static void main(String[] args) {
        String arr[] = {"Dog", "Cat", "Monkey"};
        for(String val:arr){
            System.out.println(val);
        }
        

        //to convert array to arrayList
        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);
    }
}
