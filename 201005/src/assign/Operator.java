package assign;

public class Operator {

	public static void main(String[] args) {
		//���� 1
		
		int num1=10;
		int num2=20;
		int num3=30;

		System.out.printf("������� �� �� ������ �� num1: %d, num2:%d, num3:%d\n", num1, num2, num3);
		
		num1=num2=num3;//���Կ����ڴ� �ڿ������� ����Ǿ� num3�� ���� num2�� ���Եǰ� �� ���� num1�� ���Ե�
		
		System.out.printf("������� �� �� ������ �� num1: %d, num2:%d, num3:%d\n", num1, num2, num3);

		
		//����2
		num1=(((25*5)+(36-4))-72)/5;//���ϱ⺯��, ��ȣ��� ����
		System.out.println(num1);
		
		//����3
		int sum=3;
		int tmp;
		for (int i = 2; i <5; i++) {
			tmp=i*3;
			sum+=tmp;
			System.out.println(i-1+"��° ������ ��:"+sum);
		}
		
		//����4
		int a=(((25+5)+(36/4))-72)*5;
		int b=(((25*5)+(36-4))-71)/4;
		int c=(128/4)*2;
		
		System.out.println("a:"+a+" b:"+b+" c:"+c);
		
		if(a>b && b>c) System.out.println("true");
		else System.out.println("false");
		
	}

}
