package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		map.put(new Integer(1), "ÀÏ¹ø");
		
		System.out.println(map.get(1));
		
		//NavigableSet<Integer> navi = map.navigableKeySet();
		Set<Integer> set = map.keySet();
		Iterator<Integer> itr = set.iterator();
		
		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(key+"->"+map.get(key));
			
		}
	}
}
