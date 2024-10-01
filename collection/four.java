// LEARNING THE DOUBLE QUEUE  //
// USE offer,peek,poll mainly in the case of deque 

package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class four {
    public static void main(String[] args) {
        

        //ArrayDeque<Integer> dq = new ArrayDeque<>();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println(stack.pop());


        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(63);

        System.out.println("queue "+q);

        System.out.println(q.poll());


        // dq.offer(10);
        // dq.offerLast(20);
        // dq.offerFirst(30);

        // System.out.println(dq);

        // System.out.println(dq.poll());
        // System.out.println(dq.pollLast());

        // System.out.println(dq);

        // System.out.println(dq.peekLast());
    }
}
