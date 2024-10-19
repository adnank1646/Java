package javaCollection;

import java.util.HashSet;

public class HashSet3 {
     public static void main(String[] args) {
        //Union , InterSection , Difference

        HashSet<Integer> set1 = new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("Hashset: "+set1);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Hashset 2: "+set2);


        //UNION
        // set1.addAll(set2);
        // System.out.println("Union: "+set1);  // [1, 2, 3, 4, 5]

        // //InterSection
        // set1.retainAll(set2);
        // System.out.println("Intersection: "+set1);  //[3, 4, 5]


        //Difference
        // set1.removeAll(set2);
        // System.out.println("Difference: "+set1);  // [1, 2]


        //subset
        System.out.println(set1.containsAll(set2));  //true
        System.out.println("Subset: "+set1);  //[1, 2, 3, 4, 5]


    }
}
