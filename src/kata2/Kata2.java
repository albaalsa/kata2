package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
       int [] data = {1,2,3,4,3,6,20,8,9,10,20,12,2,20,2};
       Histogram histo = new Histogram(data);
       Map <Integer,Integer> histogr = histo.getHistogram();
              
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        } 
        
        
    }
    
}
