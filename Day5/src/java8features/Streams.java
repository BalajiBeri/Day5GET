package java8features;
import java.util.*;
import java.util.stream.Collectors;
public class Streams {
	public static void main(String[] args) {
		//Streams Operations -> Intermediate(Map,filter,sorted)
		//Terminal->collect,Foreach
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(10);
		nums.add(9);
		nums.add(2);
		nums.add(5);
		System.out.println(nums);
		//use a stream to get the square of all numbers in a list
		
		List<Integer> result =nums.stream().map(n-> n*n).collect(Collectors.toList());
        System.out.println(result);
	}

}
