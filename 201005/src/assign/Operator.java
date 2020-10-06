package assign;

public class Operator {

	public static void main(String[] args) {
		//문제 1
		
		int num1=10;
		int num2=20;
		int num3=30;

		System.out.printf("문장실행 전 각 변수의 값 num1: %d, num2:%d, num3:%d\n", num1, num2, num3);
		
		num1=num2=num3;//대입연산자는 뒤에서부터 적용되어 num3의 값이 num2로 대입되고 그 값이 num1로 대입됨
		
		System.out.printf("문장실행 후 각 변수의 값 num1: %d, num2:%d, num3:%d\n", num1, num2, num3);

		
		//문제2
		num1=(((25*5)+(36-4))-72)/5;//곱하기변경, 괄호모양 변경
		System.out.println(num1);
		
		//문제3
		int sum=3;
		int tmp;
		for (int i = 2; i <5; i++) {
			tmp=i*3;
			sum+=tmp;
			System.out.println(i-1+"번째 연산의 값:"+sum);
		}
		
		//문제4
		int a=(((25+5)+(36/4))-72)*5;
		int b=(((25*5)+(36-4))-71)/4;
		int c=(128/4)*2;
		
		System.out.println("a:"+a+" b:"+b+" c:"+c);
		
		if(a>b && b>c) System.out.println("true");
		else System.out.println("false");
		
	}

}
