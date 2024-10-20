package javaCollection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        
        //Declare<
        //LinkedHashSet<Integer> lset = new LinkedHashSet<Integer>(); //homogenous
        LinkedHashSet lSet = new LinkedHashSet();

        //add element
        lSet.add(100);
        lSet.add(200);
        lSet.add(300);
        lSet.add(400);
        lSet.add(500);
        

        System.out.println(lSet);

        //same method of linked list and only difference is insertion order is preserved


    }
}
