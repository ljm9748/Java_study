package ver02;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PhoneInfor mylist[]= new PhoneInfor[10];
		String name;
		String birth;
		String num;
		PhoneInfor infor = null;
		
		//�̰Ÿ� while������... �ٵ� ������ �� ���󰥵�?
		System.out.println("�̸��� �Է��ϼ��� :");
		name=sc.nextLine();
		
		System.out.println("������ �Է��ϼ��� :");
		birth=sc.nextLine();
		
		System.out.println("��ȭ��ȣ�� �Է��ϼ��� :");
		num=sc.nextLine();
		//if(birth.length()>0) {
		if(!birth.trim().isEmpty()) {//trim()�� �Է¹޴� ���� �¿� ������ ������
			infor = new PhoneInfor(name, num, birth);
		}else {
			infor = new PhoneInfor(name, num, null);
		}
		infor.showInfor();
		
		/*
		for (int i = 0; i <10; i++) {
			System.out.println("�̸��� �Է��ϼ��� :");
			name=sc.nextLine();
			
			System.out.println("������ �Է��ϼ��� :");
			birth=sc.nextLine();
			
			System.out.println("��ȭ��ȣ�� �Է��ϼ��� :");
			num=sc.nextLine();
			
			mylist[i]=new PhoneInfor(name,num,birth);
			
		}
		for (int i = 0; i <10; i++) {
			mylist[i].showInfor();
			
		}
		*/
		
		
	}

}
