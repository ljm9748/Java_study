package friend;

import java.util.Scanner;

public class FriendInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FriendInfoHandler handler = new FriendInfoHandler(10);
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("*** �޴� ����  ***");
			System.out.println("1. �� ģ�� ���� ����");
			System.out.println("2. ���� ģ�� ���� ����");
			System.out.println("3. ��ü ���� ���");
			System.out.println("4. �⺻ ���� ���");
			System.out.println("5. EXIT");
			System.out.println("�����ϼ���>> ");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1: case 2:
				handler.addFriends(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showAllSimpleData();
				break;
			case 5:
				break;
			default:
				System.out.println("1~5�߿� ������ �ּ���");
				break;
			}
			
		}

	}

}
