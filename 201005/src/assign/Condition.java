package assign;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		//����1
		int num=120;
		if(num>0 && num%2==0) System.out.println("����̸鼭 ¦��"); 
		
		//����2
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �Է��ϼ���:");
		int score=sc.nextInt();
		if (score<0) System.out.println("0�̸��Դϴ�");
		else if (score<100) System.out.println("0�̻� 100�̸��Դϴ�");
		else if (score<200) System.out.println("100�̻� 200�̸��Դϴ�");
		else if (score<300) System.out.println("200�̻� 300�̸��Դϴ�");
		else System.out.println("300�̻��Դϴ�");

		
		//����3
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
		
		//����4
		int n=3;
		if(n==1) System.out.println("Simple Java");
		else if(n==2) System.out.println("Funny Java");
		else if(n==3) System.out.println("Fantastic Java");
		else System.out.println("The best programming language");
		
		System.out.println("Do you life coffee?");
		
		//����5
		System.out.println("���� �Է��ϼ���:");
		score=sc.nextInt();
		if (score<0) System.out.println("0�̸��Դϴ�");
		else {
			switch(score/100) {
			case 0:
				System.out.println("0�̻� 100�̸��Դϴ�");
				break;
			case 1:
				System.out.println("100�̻� 200�̸��Դϴ�");
				break;
			case 2:
				System.out.println("200�̻� 300�̸��Դϴ�");
				break;
			default:
				System.out.println("300�̻��Դϴ�");
				break;
			}
		}
		
		//����6
		num=1;
		int sum=0;
		while(num<100) {
			sum += num;
			num++;
		}
		System.out.println("1~99������:"+sum);
		
		//����7
		num=1;
		while(num<100) {
			System.out.println(num);
			num++;
		}
		do{
			System.out.println(num);
			num--;
		}while(num>0);
		
		//����8
		int now=1;
		sum=0;
		while(now<1001) {
			if(now%7==0 && now%2==0) {
				System.out.println(now);
				sum+=now;
			}
			now++;
		}
		System.out.println("����:"+ sum);
		
		//����9
		long ans=1;
		for (int i = 1; i < 11; i++) {
			ans= ans*i;
		}
		System.out.println(ans);
		
		//���� 11
		int count=0;
		for (num = 1; num < 101; num++) {
			if(num%5!=0 || num%7!=0) continue;
			count++;
			System.out.println(num);
		}
			System.out.println("count: " + count);
			
		
		//����12
			num=1;
			sum=0;
			while(true) {
				if(num%2==0 || (num%2==0&&num%3==0)) sum+=num;
				num++;
				if(sum>1000) {
					System.out.printf("num�� %d, �Ѿ sum�� %d\n", num,sum);
					break;
				}
			}
		
		//����13
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= i; j++) {
					if(i%2==0) System.out.printf("%d X %d = %d\n", i, j,i*j);
				}
			}
		
		//����14
			for (int i = 0; i <=9; i++) {
				for (int j = 0; j <= 9; j++) {
					if((11*i+11*j)==99) System.out.printf("A�� %d, B�� %d\n", i, j);
				}
			}
			
		//���� 15(�Է°��� ������� ��������)
			System.out.println("�ο��� �Է��ϼ���");
			n=sc.nextInt();
			if(n==1) System.out.println("���� �ο��� 1���Դϴ�");
			else if(n==2) System.out.println("���� �ο��� 2���Դϴ�");
			else if(n==3) System.out.println("���� �ο��� 3���Դϴ�");
			else System.out.println("���� �ο��� 3���� �����ϴ�");
			
			System.out.println("�ο��� �Է��ϼ���");
			n=sc.nextInt();
			switch(n) {
			case 1:
				System.out.println("���� �ο��� 1���Դϴ�");
				break;
			case 2:
				System.out.println("���� �ο��� 2���Դϴ�");
				break;
			case 3:
				System.out.println("���� �ο��� 3���Դϴ�");
				break;
			
			default:
				System.out.println("���� �ο��� 3���� �����ϴ�");
				break;
			}
		
		//���� 16
			num=1;
			sum=0;
			while(num<100) {
				sum+=num;
				num++;
			}
			System.out.println("1~99�� ����:"+sum);
			
			num=1;
			sum=0;
			 do{
				sum+=num;
				num++;
			}while(num<100);
			 System.out.println("1~99�� ����:"+sum);
			 
			 sum=0;
			 for (int i = 1; i < 100; i++) {
				sum+=i;
			}
			 System.out.println("1~99�� ����:"+sum);
		

	}

}
