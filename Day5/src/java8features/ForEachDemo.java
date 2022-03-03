package java8features;
import java.util.*;
public class ForEachDemo {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("cricket");
		l.add("Kabadi");
		l.add("volleyball");
		l.add("Football");
		
		System.out.println(l);
		l.forEach( s-> System.out.println(s));
	}

}
