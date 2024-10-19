package javaCollection;

import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();


        l.add("dog");
        l.add("dog");
        l.add("cat");
        l.add("horse");

        System.out.println(l);  //[dog, dog, cat, horse]

        l.addFirst("Tiger");
        l.addLast("Elephant");
        System.out.println(l);  //[Tiger, dog, dog, cat, horse, Elephant]


        System.out.println(l.getFirst()); //Tiger
        System.out.println(l.getLast()); //elephant 


        l.removeFirst();
        l.removeLast();
        System.out.println(l);

    }
}
