package collection;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Hashset �ν��Ͻ� ����: �ν��Ͻ��� �����ϱ� ���� ������� ����
		//set: ����, ������� ����x, �ߺ�x
		
		HashSet<String> set = new HashSet<String>();
		set.add("First");
		set.add("Second");
		set.add("First");
		
		System.out.println("��Ұ���:"+set.size());
		
		//Set<e>�� �����ϴ� �������� �������� �ʱ� ������ �ϰ� ó�������ؼ��� Iterator<E>�ν��Ͻ��� �̿��Ͽ� ó��
		//Collection<E> i terator()�޼���  Iterator<E>�� ��ȯ

	}

}
