package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
       int [] data = {1,2,3,4,3,6,20,8,9,10,20,12,2,20,2};
       Map <Integer,Integer> histogram = new HashMap <>();
       
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key)+ 1 : 1);   
                  
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        } 
        
        
    }
    
}
