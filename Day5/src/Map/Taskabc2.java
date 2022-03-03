package Map;

import java.util.*;
public class Taskabc2 {
	Map<Character, Integer> letterCount(String word)
	{
		Map<Character,Integer> ccount = new TreeMap<Character,Integer>();
		System.out.println(word.toCharArray());
		for(char c : word.toCharArray())
		{
			if(ccount.containsKey(c))
				ccount.put(c, ccount.get(c)+1);
			else
				ccount.put(c, 1);
		}
       
		
		return ccount;
		
	}
public static void main(String[] args) {
	System.out.println(new Taskabc2().letterCount("appllo"));
}
}
