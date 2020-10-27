package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SimpleNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<SimpleNumber> set = new HashSet<SimpleNumber>();
		
		set.add(new SimpleNumber(10));
		set.add(new SimpleNumber(20));
		set.add(new SimpleNumber(30));
		set.add(new SimpleNumber(10));
		
		System.out.println("SET 요소의 개수:"+set.size());
		System.out.println();
		
		Iterator<SimpleNumber> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		

	}

	/*
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	*/

}
