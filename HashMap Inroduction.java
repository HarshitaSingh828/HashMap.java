//HashMap is a data sturcture use for table information.
// It has key value pair
//The great advantage of using this it will use O(1)
import java.io.*;
import java.util.*;

public class Main{
 public static void main(String[]args){
     HashMap <String,Integer> hm = new HashMap<>();
     hm.put("India", 135); //put() it will update the value if key already exits else insert it.
     hm.put("China", 200);
     hm.put("Pak", 35);
     hm.put("UK", 20);
     hm.put("US", 10);
     System.out.println(hm);
     
     hm.put("Nigeria", 5);
     hm.put("US", 25);
     System.out.println(hm);
        System.out.println(hm.get("India")); // it will return val corresponding to the key else return null.
        System.out.println(hm.get("Utopia"));
        System.out.println(hm.containsKey("India")); // it will return true if key exists else return false.
        System.out.println(hm.containsKey("Utopia"));
        
        Set<String> Keys = hm.keySet();//it will return all the keys remember k should be small and s should be capital.
        System.out.println(Keys);
        
        for(String key : hm.keySet()){ // this will give key value pairs.
            Integer val = hm.get(key);
            System.out.println(key + " " + val);
        }
     
 }  
}
