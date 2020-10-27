package collection;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> tset= new TreeSet<Integer>();
		
		tset.add(1);
		tset.add(5);
		tset.add(13);
		tset.add(4);
		tset.add(2);
		tset.add(44);
		tset.add(12);
		tset.add(1);
		
		System.out.println("treeset 요소개수:"+tset.size());
		
	}
	
	
	

}
