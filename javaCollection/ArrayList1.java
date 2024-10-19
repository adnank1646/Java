package javaCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        

        //Declare ArrayList
        //ArrayList al = new ArrayList(); //for heterogenos element
        //ArrayList <Integer> al = new ArrayList<Integer>();
        //ArrayList <String> al = new ArrayList<String>();
        //both above are are used for homogenous element
        //List arl = new ArrayList();

        ArrayList al = new ArrayList();

        //Add new elements to the arrayList (Heterogenous)
        al.add(100);
        al.add("welcome");
        al.add(12.36);
        al.add('A');
        al.add(true);

        System.out.println(al);

        //size()
        System.out.println("no. of elements in arraylist: "+al.size());

        //remove(obj) or by remove(index)
        al.remove(1);
        //al.remove("welcome");
        System.out.println(al);
        System.out.println("after removing elements from arraylist: "+al);


        //insert a new element by using index
        //add(index,object)
        al.add(2, "Java");
        System.out.println("After insertion: "+al);


        //retrieve specific element
        System.out.println(al.get(2));


        //change/replace element
        al.set(2, "DSA"); 
        System.out.println("After replacing element: "+al);


        //searching - contains() --returns true/false
        System.out.println(al.contains("DSA"));
        System.out.println(al.contains("not"));


        //isEmpty()
        System.out.println(al.isEmpty());


        //1) for loop
       /*  System.out.println("Reading element using for loop");

        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }  */



        //2) for..each loop
        /*System.out.println("Reading element using for each loop");
        for(Object e:al){
            System.out.println(e);
        }  */


        //3) iterator()
        System.out.println("Reading element using iterator method");

        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next()); //print the element and move to next
        }
    }
}
