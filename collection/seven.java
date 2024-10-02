// Learning Maps //


package Collections;

import java.util.*;

public class seven {
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();


        // to add elements in the maps by key value
        // pair and duplicate not allow 
        //duplicate value is allowed but duplicate key is not allowed
        map.put("us", "United States");
        map.put("in", "India");
        map.put("en", "India");

        ArrayList<String> keys = new ArrayList<>(map.keySet());

        System.out.println(keys);


        //for removing the elements we can remove only using key value
        //bcos here key works as id or index
        // map.remove("en");


        // //By using only key we can check the availability of element in maps
        // System.out.println(map.containsKey("on"));
        // System.out.println("contains value : "+map.containsValue("Indian"));

        // System.out.println(map);

        // //get operation to get the value by using the key
        // System.out.println(map.get("in"));
        // System.out.println(map.getOrDefault("io", "others"));

    }
}
