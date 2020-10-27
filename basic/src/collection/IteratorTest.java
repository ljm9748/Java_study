package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("First");
		list.add("Second");
		list.add("Third");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String str= itr.next();
			System.out.println(str);
			
			if(str.compareTo("Third")==0) {
				itr.remove();
			}
		}
		System.out.println("삭제후 출력");
		itr = list.iterator();
		while(itr.hasNext()) {
			String str= itr.next();
			System.out.println(str);

		}
	}

}
