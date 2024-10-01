package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class five {
    public static void main(String[] args) {

        Queue<Integer> pg = new PriorityQueue<>((a,b)-> b-a);

        pg.add(30);
        pg.add(40);
        pg.add(10);
        pg.add(20);


        System.out.println(pg);
        System.out.println(pg.poll());
        System.out.println(pg);
        System.out.println(pg.poll());
    }
}