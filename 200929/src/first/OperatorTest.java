package first;

import java.lang.Math;
 
public class OperatorTest {

	public static void main(String[] args) {

		int num1=10;
		int num2=8;
		//연산자 연산
		System.out.println("10/8="+num1/num2);
		System.out.println("10/-8="+num1/-num2);
		System.out.println("10%8="+num1%num2);
		System.out.println("10%-8="+num1%-num2);
		System.out.println("10f/8f="+10f/8f);
		System.out.println("10f/8="+10f/8);
		System.out.println("10f/8="+num1/(float)num2);
		
		
		double d= (double)0.1f;
		System.out.println(d);
		System.out.println(0.1f);
		
		boolean result1= (num1==10) && (num2==8);
		System.out.println(result1);
		if(!(num1==num2)) {
			System.out.println("두 수는 다르다");
		}else {
			System.out.println("두 수는 같다");
		}
		
		float pi= 3.141592f;
		System.out.printf("%.4f\n",pi);
		System.out.println(Math.round(pi*1000)/1000f);
		float tmp=(int)(pi*100)/100f;
		System.out.println(tmp);
	}

}
