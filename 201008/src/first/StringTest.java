package first;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 ="My String";
		String str2 ="My String";
		String str3 ="Your String";
		String str4 = new String("My String");//������ ������ �ٸ� �ν��Ͻ��� �����ϰ� ���� ���!
		
		//�������� ���� ���� ��: ���� �ν��Ͻ��� �����Ѵ�
		if(str1==str2) {
			System.out.println("���� �ν��Ͻ� ����");
		}else {
			System.out.println("�ٸ� �ν��Ͻ� ����");
		}
		
		if(str1==str3) {
			System.out.println("���� �ν��Ͻ� ����");
		}else {
			System.out.println("�ٸ� �ν��Ͻ� ����");
		}
		
		if(str1==str4) {
			System.out.println("���� �ν��Ͻ� ����");
		}else {
			System.out.println("�ٸ� �ν��Ͻ� ����");
		}


	}

}
