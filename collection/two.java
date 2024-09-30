package Collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Iterator;

public class two {
    public static void main(String[] args) {
        // List<String> fruits = new ArrayList<>();

        // fruits.add("kiwi");
        // fruits.add("mango");
        // fruits.add("banana");
        // fruits.add("Apple");

        // // To iterate through the list
        // for(int i=0 ; i<fruits.size(); i++){
        //     System.out.println("fruit is "+ fruits.get(i));
        // }

        // for (String fruit : fruits) {
        //     System.out.println("For each fruit "+fruit);
        // }

        // Iterator<String> fe = fruits.iterator();
        // while (fe.hasNext()) {
        //     System.out.println("iterator "+fe.next());
        // }

        // List<String> smallList = fruits.subList(1, 3);
        // System.out.println(smallList);


        Stack<String> fruit = new Stack<>();

        fruit.push("A");
        fruit.push("B");
        fruit.push("C");
        fruit.push("D");

        System.out.println(fruit.pop());
        System.out.println(fruit);
        System.out.println(fruit.peek());
        System.out.println(fruit);


    }
}