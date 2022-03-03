package Map;

import java.util.*;
import java.util.Map.Entry;
public class MyMap {
	public static void main(String[] args) {
		Map<String,Integer> fps =new HashMap<String,Integer>();
	     fps.put("Apple", 240);
         fps.put("Grape", 190);
         fps.put("Orange", 80);
         fps.put("Kiwi", 120);               
         fps.put("Grape", 210);

         System.out.println(fps.containsKey("Apple"));
         System.out.println(fps.containsValue(120));           

         System.out.println(fps.get("Apple"));   

         Set<String> keys=fps.keySet();
         System.out.println(keys);

         Collection<Integer> vals=fps.values();
         System.out.println(vals);

         fps.remove("Kiwi");
         System.out.println(fps);

         for(Entry<String, Integer> ss: fps.entrySet())
         {
             System.out.println(ss.getKey());
             System.out.println(ss.getValue());
         }
	}
}
	