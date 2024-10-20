package javaCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMap1 {
    public static void main(String[] args) {
        

        //Declaration
        //HashMap m = new HashMap();
        HashMap <Integer,String> m = new HashMap<Integer,String>();

        //Add 
        m.put(101,"John");
        m.put(102,"David");
        m.put(103,"Scott");
        m.put(104,"Mary");
        m.put(105,"XCM");
        m.put(106,"David"); //multiple values allowed

        System.out.println(m);  //{101=John, 102=David, 103=Scott, 104=Mary}
        
        //for retrieving value
        System.out.println( m.get(105)); //XCM

        //for removing
        m.remove(106); //remove pair from hashmap
        System.out.println(m);

        System.out.println(m.containsKey(101));
        System.out.println(m.containsKey(106));

        //for check the vlaue
        System.out.println(m.containsValue("David"));
        System.out.println(m.containsKey("ui"));

        //isEMpty
        System.out.println(m.isEmpty());

        //keyset
        System.out.println(m.keySet()); //return all keys as set //[101, 102, 103, 104, 105]

        for(Object i:m.keySet()){
            System.out.println(i);
        }


        //values
        System.out.println(m.values()); //return all value as collection //[John, David, Scott, Mary, XCM]


        for(Object i:m.values()){
            System.out.println(i);
        }

        for(Object i:m.keySet()){
            System.out.println(i+"  "+m.get(i));
        }


        //Entry methods 
        // *************
        for(Map.Entry entry:m.entrySet()){
             System.out.println(entry.getKey()+"    "+entry.getValue());
        }

        //Iterator()
        Set s = m.entrySet();
        Iterator<e> itr = s.iterator();

        while (itr.hasNext()) {
        Map.Entry entry= (Entry)itr.next();  //101  x entry
        System.out.println(entry.getKey()+"  "+entry.getValue());
        }


    }
}
