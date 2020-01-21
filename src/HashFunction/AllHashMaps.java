package HashFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AllHashMaps extends LinkedHashMap<Integer,Integer>{

	/*Here the first value capacity is the size of the linkedhashmap
	the second value is called Loadfactor/fill ratio. this determines how much of the map should be filled.
	Third boolean value determines how maintain the ordering of the map.
		a. true: last access order
		b. false: insertion order 
	*/
	public AllHashMaps(int capacity) {
		super(capacity,0.75F,true);
	}
	public static void main(String ...args) {
		foreachTest();
	}
	
	public static void foreachTest() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		/*map.put(1, "one");
		map.put(2, "two");
		map.put(7, "seven");
		map.forEach((k,v)->System.out.println(k+"-"+v));*/
		
		Map<String, ArrayList<String>> map1 = new HashMap<String, ArrayList<String>>();
		map1.put("a", new ArrayList<String>());
		map1.put("b", new ArrayList<String>(Arrays.asList("b1","b2")));

		List<String> list = map1.get("a");
	}
	
	
	
	
}
