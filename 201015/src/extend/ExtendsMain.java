package extend;

public class ExtendsMain {
	public static void main(String[] args) {
		//Ŭ���� ����� ����� ����̰� Ŭ���� ����� ~ ���������� ����� ���
		//��Ӱ��� ������ �ɶ� ��� ����� ���ο� Ŭ������ �����Ҽ��ִ�
		//IS-A����: ��ȭ��-�޴���ȭ(��Ӱ���)
		//HAS - A����: ����-��(��ΰ� �����͵� �ƴϰ� �� �����͵� �ƴ�): Ŭ������ �ν��Ͻ�����
		Child c1= new Child();
		Child2 c2=new Child2("King");
		GrandChild gc= new GrandChild("grandking");
		
		System.out.println(c1.getMoney());
		System.out.println(c2.getMoney()); 
		System.out.println(c2.name);
		System.out.println(gc.getMoney());
	}
 
}
