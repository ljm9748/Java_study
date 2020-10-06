package assign;

public class Operator2 {

	public static void main(String[] args) {
		// 문제1
		System.out.println("문제1");
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의아스키코드는 65

		System.out.println(y+= 10 - x++); //13
		System.out.println(x+=2); //5
		System.out.println(!('A' <= c && c <='Z') ); //false
		System.out.println('C'-c); //2
		System.out.println('5'-'0'); //5
		System.out.println(c+1); //66
		System.out.println(++c); //B
		System.out.println(c++); //B
		System.out.println(c); //C
		
		//문제2
		System.out.println("문제2");
		int numOfApples =123; // 사과의 개수
		int sizeOfBucket =10;// 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		// 모든 사과를담는데 필요한 바구니의 수
		int numOfBucket = (numOfApples%sizeOfBucket)==0? numOfApples/sizeOfBucket: numOfApples/sizeOfBucket+1;

		System.out.println("필요한바구니의 수 :"+numOfBucket);
		
		//문제3
		System.out.println("문제3");
		int num = 10;
		System.out.println(num>0?"양수":num==0?"0":"음수");
		
		//문제4
		System.out.println("문제4");
		num = 456;
		System.out.println((int)num/100 *100 );
		num = 111;
		System.out.println((int)num/100 *100 );
		
		//문제5
		System.out.println("문제5");
		num = 333;
		System.out.println((int)num/10 *10 +1 );
		num = 777;
		System.out.println((int)num/10 *10 +1 );
		
		//문제6
		System.out.println("문제6");
		num=24;
		System.out.println(10-num%10);

		
		//문제7
		System.out.println("문제7");
		int fahrenheit =100;
		float celcius = (float)5/9*(fahrenheit-32) ;
		celcius=(int)(celcius*1000)%10>=5? (int)(celcius*100)+1:(int)(celcius*100);
		celcius=celcius/100f;
		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		//문제8
		System.out.println("문제8");
		byte a = 10;
		byte b = 20;
		byte c2 = (byte)(a + b);  //앞 문제에 이미 c가 있어 임의로 c2로 지정
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
		
		//문제9
		System.out.println("문제9");
		ch = 'z';
		boolean b2 = (ch>='A' && ch<='z');
		System.out.println(b2);
		
		
		//문제10
		System.out.println("문제10");
		ch = 'A';
		char lowerCase = (ch>='A' && ch<='Z' ) ? ( (char)(ch+32) ) : ch;

		System.out.println("ch:"+ch);
		System.out.println("chto lowerCase:"+lowerCase);
	}

}
