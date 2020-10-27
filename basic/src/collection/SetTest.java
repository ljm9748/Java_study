package collection;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Hashset 인스턴스 생성: 인스턴스를 저장하기 위한 저장공간 생성
		//set: 집합, 저장순서 유지x, 중복x
		
		HashSet<String> set = new HashSet<String>();
		set.add("First");
		set.add("Second");
		set.add("First");
		
		System.out.println("요소개수:"+set.size());
		
		//Set<e>은 저장하느 ㄴ순서르 ㄹ가지지 않기 때문에 일괄 처리를위해서는 Iterator<E>인스턴스를 이용하여 처리
		//Collection<E> i terator()메서드  Iterator<E>를 반환

	}

}
