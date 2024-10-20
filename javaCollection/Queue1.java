package javaCollection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue1 {
    public static void main(String[] args) {
        //PriortiQueue
    //Declaration
    PriorityQueue q = new PriorityQueue();

    //Adding element add() / offer()
    q.add("A");
    q.add("B");
    q.add("C");
    q.offer("C");

    System.out.println(q); //[A, B, C, C] insertion oredr preserved and duplicate allowed

    //Get head Element by element() & peek()
    //System.out.println(q.element());  //if queue empty it gives exception
    //System.out.println(q.peek()); //return null 

    //Return and remove the element from queue remove() & poll()
    // System.out.println(q.remove()); //A
    // System.out.println(q);

    System.out.println(q.poll()); //A
    System.out.println(q); //[B,C,C]


    //Iterator itr = q.iterator();
    // while(itr.hasNext()){
    //     System.out.println(itr.next()); 
    // }


    for(Object o:q){
        System.out.println(o);
    }



    }
}
