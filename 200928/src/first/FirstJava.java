package first;

public class FirstJava {

	public static void main(String[] args) {
		// ������ ���õ� ����
		int num1;
		num1=10;
		int num2=20;
		int num3=num1+num2;
		System.out.printf("num1: %d, num2: %d, num3: %d\n", num1,num2,num3);
		
		float d1= 1.0000001f;
		double d2= 1.0000001;
		
		System.out.println((double)d1);//float�� double�� �ٲ�鼭 ������ �߻�
		System.out.println(d1+d2);
		
		char c1='A';
		System.out.println(c1);
		System.out.println((int)c1);
		
		boolean check= true;
		if(check) {
			System.out.println(check);
		}
		

	}

}
