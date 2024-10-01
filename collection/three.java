package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class three {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();



    //TO add ellements in queue
    //use add or offer but most recomennded is offer
        q.offer(10);
        q.add(20);
        q.add(52);
        q.offer(85);

        System.out.println(q);
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        System.out.println(q.poll());
        //use poll not remove bcoz of exception problem

        // System.out.println(q);

        // System.out.println(q.poll());
        // System.out.println(q);

        // System.out.println(q.peek());
        // System.out.println(q);
    }
}