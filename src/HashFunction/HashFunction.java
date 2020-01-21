package HashFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class HashFunction {

	public static void main(String...args) {
		//generateHash1();
		//test();
		
		int[] arr1 = {2,3};
		int[] arr2 = {2,3};
		int[] arr3 = {-2,3};
		int[] arr4 = {3,-2};
		
		System.out.println(Arrays.hashCode(arr1));
		System.out.println(Arrays.hashCode(arr2));
		System.out.println(Arrays.hashCode(arr3));
		System.out.println(Arrays.hashCode(arr4));
		
		
	}
	
	/*public static void test() {
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(-1);
		resultList.add(al);
		
		List<Integer> bl = new ArrayList<Integer>();
		bl.add(3);
		bl.add(-2);
		bl.add(1);
		resultList.add(bl);
		
		List<Integer> cl = new ArrayList<Integer>();
		cl.add(2);
		cl.add(-1);
		cl.add(1);
		resultList.add(cl);
		
		for(List<Integer> list: resultList) {
			//int listHashCode = list.hashCode();
			int sum = 0;
			int[] arr = new int[list.size()];
			for(int i=0;i<list.size();i++) {
				arr[i]=list.get(i);
			}
			int listHashCode = Arrays.hashCode(arr);
			
			System.out.println(listHashCode);
			if(!map.containsKey(listHashCode)) {
				map.put(listHashCode, sum);
			}
		}
		
		for(List<Integer> list: resultList) {
			int hash = generateHash(list);
			
			if(!map.containsKey(hash)) {
				int value = 0;
				for(Integer val:list) {
					value += val;
				}
				map.put(hash, value);
			}
		}
		//System.out.println(map);
	}*/
	
	/*public static int generateHash(List<Integer> list) {
		int hash = 1;
	
		for(Integer val:list)
			hash += val;
		
		hash = Objects.hash(hash);
		
		return hash; 
	}*/
	
}
