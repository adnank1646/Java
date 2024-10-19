package javaCollection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");


        LinkedList new_l = new LinkedList();
        new_l.addAll(l);
        System.out.println(new_l);  //[X, Y, Z, A, B, C]


        new_l.removeAll(l);
        System.out.println(new_l);  //[]

    //sorting only possible in homogenous element
        //sort()  Collection.sort(collection)
        System.out.println("Before sorting: "+l); //[X, Y, Z, A, B, C]
        Collections.sort(l);
        System.out.println("After sorting: "+l); //[A, B, C, X, Y, Z]

        //for reverse order
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Sort in Reverse Order: "+l); //[Z, Y, X, C, B, A]



        //shufffling
        Collections.shuffle(l);
        System.out.println(l); //[X, Z, A, C, B, Y]
    }
}

