package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<E>: ���� ���� ����(�ݺ��� �̿� ����), �ߺ� ���� ���
		//�ν��Ͻ� ������ ���������ϴ� Ŭ����
		ArrayList<Integer> list=new ArrayList<Integer>();

		
		//������ ����: �������� ����
		//add(<T>)
		list.add(new Integer(11));
		list.add(10); // Auto Boxing
		System.out.println("����� ��:"+list.get(0));
		System.out.println("����� ����:"+list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+"��° ����� ��:"+list.get(i));
		}
		
		//list ����� ����
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+"��° ����� ��:"+list.get(i));
		}
		
		
		LinkedList<Integer> list2=new LinkedList<Integer>();
		List<Integer> list3=new LinkedList<Integer>();
	}

}
