package assign;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		//문재1
		int num=120;
		if(num>0 && num%2==0) System.out.println("양수이면서 짝수"); 
		
		//문제2
		Scanner sc=new Scanner(System.in);
		System.out.println("수를 입력하세요:");
		int score=sc.nextInt();
		if (score<0) System.out.println("0미만입니다");
		else if (score<100) System.out.println("0이상 100미만입니다");
		else if (score<200) System.out.println("100이상 200미만입니다");
		else if (score<300) System.out.println("200이상 300미만입니다");
		else System.out.println("300이상입니다");

		
		//문제3
		int num1=50;
		int num2=20;
		int big, diff;
		
		if(num1>num2) {
			big=num1;
		}else {
			big=num2;
		}
		
		if(num1>num2) {
			diff=num1-num2;
		}else {
			diff=num2-num1;
		}
		
		System.out.println("big:"+big+" diff:"+diff);
		
		//문제4
		int n=3;
		if(n==1) System.out.println("Simple Java");
		else if(n==2) System.out.println("Funny Java");
		else if(n==3) System.out.println("Fantastic Java");
		else System.out.println("The best programming language");
		
		System.out.println("Do you life coffee?");
		
		//문제5
		System.out.println("수를 입력하세요:");
		score=sc.nextInt();
		if (score<0) System.out.println("0미만입니다");
		else {
			switch(score/100) {
			case 0:
				System.out.println("0이상 100미만입니다");
				break;
			case 1:
				System.out.println("100이상 200미만입니다");
				break;
			case 2:
				System.out.println("200이상 300미만입니다");
				break;
			default:
				System.out.println("300이상입니다");
				break;
			}
		}
		
		//문제6
		num=1;
		int sum=0;
		while(num<100) {
			sum += num;
			num++;
		}
		System.out.println("1~99의합은:"+sum);
		
		//문제7
		num=1;
		while(num<100) {
			System.out.println(num);
			num++;
		}
		do{
			System.out.println(num);
			num--;
		}while(num>0);
		
		//문제8
		int now=1;
		sum=0;
		while(now<1001) {
			if(now%7==0 && now%2==0) {
				System.out.println(now);
				sum+=now;
			}
			now++;
		}
		System.out.println("합은:"+ sum);
		
		//문제9
		long ans=1;
		for (int i = 1; i < 11; i++) {
			ans= ans*i;
		}
		System.out.println(ans);
		
		//문제 11
		int count=0;
		for (num = 1; num < 101; num++) {
			if(num%5!=0 || num%7!=0) continue;
			count++;
			System.out.println(num);
		}
			System.out.println("count: " + count);
			
		
		//문제12
			num=1;
			sum=0;
			while(true) {
				if(num%2==0 || (num%2==0&&num%3==0)) sum+=num;
				num++;
				if(sum>1000) {
					System.out.printf("num은 %d, 넘어선 sum은 %d\n", num,sum);
					break;
				}
			}
		
		//문제13
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= i; j++) {
					if(i%2==0) System.out.printf("%d X %d = %d\n", i, j,i*j);
				}
			}
		
		//문제14
			for (int i = 0; i <=9; i++) {
				for (int j = 0; j <= 9; j++) {
					if((11*i+11*j)==99) System.out.printf("A는 %d, B는 %d\n", i, j);
				}
			}
			
		//문제 15(입력값이 양수임을 전제로함)
			System.out.println("인원을 입력하세요");
			n=sc.nextInt();
			if(n==1) System.out.println("현재 인원은 1명입니다");
			else if(n==2) System.out.println("현재 인원은 2명입니다");
			else if(n==3) System.out.println("현재 인원은 3명입니다");
			else System.out.println("현재 인원은 3명보다 많습니다");
			
			System.out.println("인원을 입력하세요");
			n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("현재 인원은 1명입니다");
				break;
			case 2:
				System.out.println("현재 인원은 2명입니다");
				break;
			case 3:
				System.out.println("현재 인원은 3명입니다");
				break;
			
			default:
				System.out.println("현재 인원은 3명보다 많습니다");
				break;
			}
		
		//문제 16
			num=1;
			sum=0;
			while(num<100) {
				sum+=num;
				num++;
			}
			System.out.println("1~99의 합은:"+sum);
			
			num=1;
			sum=0;
			 do{
				sum+=num;
				num++;
			}while(num<100);
			 System.out.println("1~99의 합은:"+sum);
			 
			 sum=0;
			 for (int i = 1; i < 100; i++) {
				sum+=i;
			}
			 System.out.println("1~99의 합은:"+sum);
		

	}

}
