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
		
		//이거를 while문으로... 근데 데이터 다 날라갈듯?
		System.out.println("이름을 입력하세요 :");
		name=sc.nextLine();
		
		System.out.println("생일을 입력하세요 :");
		birth=sc.nextLine();
		
		System.out.println("전화번호를 입력하세요 :");
		num=sc.nextLine();
		//if(birth.length()>0) {
		if(!birth.trim().isEmpty()) {//trim()은 입력받는 값의 좌우 공백을 없애줌
			infor = new PhoneInfor(name, num, birth);
		}else {
			infor = new PhoneInfor(name, num, null);
		}
		infor.showInfor();
		
		/*
		for (int i = 0; i <10; i++) {
			System.out.println("이름을 입력하세요 :");
			name=sc.nextLine();
			
			System.out.println("생일을 입력하세요 :");
			birth=sc.nextLine();
			
			System.out.println("전화번호를 입력하세요 :");
			num=sc.nextLine();
			
			mylist[i]=new PhoneInfor(name,num,birth);
			
		}
		for (int i = 0; i <10; i++) {
			mylist[i].showInfor();
			
		}
		*/
		
		
	}

}
