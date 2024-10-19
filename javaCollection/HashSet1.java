package javaCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {


        //HashSet hs = new HashSet();  //Default Capicity 16 Load Factor 0.75
        //HashSet hs = new HashSet(100); //initial capicity 100
        //HashSet hs = new HashSet(100,(float)0.90);//initial capicity 100 & Load Factor 0.90
        //HashSet<Integer> hs = new HashSet<Integer>(); //for homogenous element

        HashSet hs = new HashSet();


        //Add objects/elements into Hashset
        hs.add(100);
        hs.add("Welcome");
        hs.add(12.69);
        hs.add('G');
        hs.add(true);
        hs.add(null);
       
        //Insertion order not preserved
        System.out.println(hs);

        //remove()
        hs.remove(12.69);
        System.out.println("After removing element: "+hs);


        //contains()
        System.out.println(hs.contains("Welcome"));  //true
        System.out.println(hs.contains(12));   //false

        //isEmpty()
        System.out.println(hs.isEmpty());

        

        //Reading element from the hashset
        //reading object by using for:each loop
        for(Object i:hs){
            System.out.println(i);
        }

        //rading object using iterator method
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
