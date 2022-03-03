package Map;
import java.util.*;
import java.util.Map.Entry;
public class Tasksabc {
	
		List<String> findPassed(Map<String,Integer> marks)
		{ List<String> obj=new ArrayList<String>();
        //Solution 1
        for(Entry<String, Integer> f : marks.entrySet())
        {
            if(f.getValue()>70)
                obj.add(f.getKey());
        }
        //Solution 2
        Set<String> keys=marks.keySet();
        for(String k : keys)
        {
            if(marks.get(k)>70)
                obj.add(k);
        }
        return obj; 
		}
	public static void main(String[] args) {
		Map<String,Integer> marks =new HashMap<String, Integer>();
		marks.put("Walter", 90);
		marks.put("Jesse", 65);
		marks.put("Skyler", 67);
		marks.put("Hank", 87);
		
		Tasksabc ob = new Tasksabc();
		System.out.println(ob.findPassed(marks));
		
	}
	
	

}
