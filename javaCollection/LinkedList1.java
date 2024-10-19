package javaCollection;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedList1 {
    public static void main(String[] args) {
        

        //Declare Linked List
        //LinkedList l = new LinkedList(); //heterogenous data
        //for homogenous data
        //LinkedList <Integer> ll = new LinkedList<Integer>();
        //LinkedList <String> ls = new LinkedList<String>();

        LinkedList l = new LinkedList();

        //Add elements into LinkedList 
        l.add(100);
        l.add("welcome");
        l.add(12.3);
        l.add('C');
        l.add(true);
        l.add(null);

        System.out.println(l);
        System.out.println(l.size());


        //remove elements from LinkedList
        l.remove(3); //index
        //l.remove('C'); //object
        System.out.println("After removing new list is: "+l);


        //Insert/adding element in the middle of LinkedList
        l.add(3,"Java");
        System.out.println("After inserting element: "+l);


        //retrieve value/object
        System.out.println(l.get(3));


        //change the value
        l.set(5, "X");
        System.out.println("After changing value: "+l);


        //contains()
        System.out.println(l.contains("Java"));
        System.out.println(l.contains("nop"));

        //isEmpty()
        System.out.println(l.isEmpty()); //false



        //Reading elements from LL using FOR loop
        // for(int i=0; i<l.size(); i++){
        //      System.out.println(l.get(i));
        // }


        //Reading elements from LL using FOR-Each loop
        // for(Object i: l){
        //     System.out.println(i);
        // }


       //Reading elements from LL using iterator
       Iterator it = l.iterator();
       while (it.hasNext()) {
        System.out.println(it.next());
       }





    } 
}
