package assign;

public class Operator2 {

	public static void main(String[] args) {
		// ����1
		System.out.println("����1");
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'�Ǿƽ�Ű�ڵ�� 65

		System.out.println(y+= 10 - x++); //13
		System.out.println(x+=2); //5
		System.out.println(!('A' <= c && c <='Z') ); //false
		System.out.println('C'-c); //2
		System.out.println('5'-'0'); //5
		System.out.println(c+1); //66
		System.out.println(++c); //B
		System.out.println(c++); //B
		System.out.println(c); //C
		
		//����2
		System.out.println("����2");
		int numOfApples =123; // ����� ����
		int sizeOfBucket =10;// �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		// ��� �������µ� �ʿ��� �ٱ����� ��
		int numOfBucket = (numOfApples%sizeOfBucket)==0? numOfApples/sizeOfBucket: numOfApples/sizeOfBucket+1;

		System.out.println("�ʿ��ѹٱ����� �� :"+numOfBucket);
		
		//����3
		System.out.println("����3");
		int num = 10;
		System.out.println(num>0?"���":num==0?"0":"����");
		
		//����4
		System.out.println("����4");
		num = 456;
		System.out.println((int)num/100 *100 );
		num = 111;
		System.out.println((int)num/100 *100 );
		
		//����5
		System.out.println("����5");
		num = 333;
		System.out.println((int)num/10 *10 +1 );
		num = 777;
		System.out.println((int)num/10 *10 +1 );
		
		//����6
		System.out.println("����6");
		num=24;
		System.out.println(10-num%10);

		
		//����7
		System.out.println("����7");
		int fahrenheit =100;
		float celcius = (float)5/9*(fahrenheit-32) ;
		celcius=(int)(celcius*1000)%10>=5? (int)(celcius*100)+1:(int)(celcius*100);
		celcius=celcius/100f;
		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		//����8
		System.out.println("����8");
		byte a = 10;
		byte b = 20;
		byte c2 = (byte)(a + b);  //�� ������ �̹� c�� �־� ���Ƿ� c2�� ����
		char ch = 'A';
		ch = (char)(ch + 2);     

		float f = 3 / 2f;    
		long l = 3000 * 3000 * 3000L;    
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;    

		System.out.println("c="+c2);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		//����9
		System.out.println("����9");
		ch = 'z';
		boolean b2 = (ch>='A' && ch<='z');
		System.out.println(b2);
		
		
		//����10
		System.out.println("����10");
		ch = 'A';
		char lowerCase = (ch>='A' && ch<='Z' ) ? ( (char)(ch+32) ) : ch;

		System.out.println("ch:"+ch);
		System.out.println("chto lowerCase:"+lowerCase);
	}

}
