//LEARNING SETS///
//DUPLICATES elements are not allowed in the sets
//there is a bag in which i can store elements
//without seeing at random order but duplicate
//not allow to store
//Bcos of its randomness all operation is having time complexity of O(1)
//In linkedhashset the element store in Linkedlist form that is in same order as we stored
//but duplicate are also not allowed in this 
//In TreeSet the element store in sorted order u can store in whatever way u want

package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class student{
    int rollNo;
    String name;
    public student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        student other = (student) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "student [rollNo=" + rollNo + ", name=" + name + "]";
    }
    
    
}

public class six {
    public static void main(String[] args) {

             Set<student> set = new HashSet<>();

             student s1 = new student(1, "Anuj");
             student s2 = new student(1, "Anuj");
             System.out.println(s1.equals(s2) );

             set.add(new student(13, "Adnan"));
             set.add(new student(13, "Adnan"));
             set.add(new student(13, "Adnan"));

             System.out.println(set);


        //   Set<String> set = new HashSet<>();


        //   set.add("adnan");
        //   set.add("nio");
        //   set.add("kio");
        //   set.add("kio");

        //   System.out.println(set);
        

        // Set<Integer> set = new HashSet<>();

        // set.add(10);
        // set.add(70);
        // set.add(20);
        // set.add(60);
        // set.add(30);

        // set.remove(10);

        // System.out.println(set);
        
        
        // Set<Integer> link = new LinkedHashSet<>();
        // link.add(10);
        // link.add(70);
        // link.add(20);
        // link.add(60);
        // link.add(30);

        // //add - O(1) and remove - O(n)

        // System.out.println(link);


        // Set<Integer> tree = new TreeSet<>();
        // tree.add(10);
        // tree.add(70);
        // tree.add(20);
        // tree.add(60);
        // tree.add(30);

        // tree.remove(20);
        // System.out.println(tree.contains(60));

        // //add - O(logn) and remove - O(logn)

        // System.out.println(tree);
    }
}
