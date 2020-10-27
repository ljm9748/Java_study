package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<E>: 저장 순서 유지(반복문 이용 용이), 중복 저장 허용
		//인스턴스 저장을 목적으로하는 클래스
		ArrayList<Integer> list=new ArrayList<Integer>();

		
		//데이터 저장: 참조값을 저장
		//add(<T>)
		list.add(new Integer(11));
		list.add(10); // Auto Boxing
		System.out.println("요소의 값:"+list.get(0));
		System.out.println("요소의 개수:"+list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+"번째 요소의 값:"+list.get(i));
		}
		
		//list 요소의 삭제
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+"번째 요소의 값:"+list.get(i));
		}
		
		
		LinkedList<Integer> list2=new LinkedList<Integer>();
		List<Integer> list3=new LinkedList<Integer>();
	}

}
