package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListDS {
	
	public static void main(String ...args) {
		//test1();
		foreachTest();
	}
	
	public static void test1() {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,7,9,10,11));
		
		list.forEach(item->System.out.println(item));
		System.out.println("====");
		list.subList(1, 3).forEach(item->System.out.println(item));
	}
	
	public static void foreachTest() {
		List<Integer> resultList = new ArrayList<Integer>();
		resultList.add(4);
		resultList.add(7);
		resultList.add(9);
		
		resultList.forEach(x->System.out.println(x));
		resultList.remove(7);
		resultList.forEach(x->System.out.println(x));
		
	}
	
	
	
	public static void test() {
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		resultList.add(list);
		
		if(resultList.containsAll(list)) {
			System.out.println("yes");
		}
		
		
	}
}
