package friend;

import java.util.Scanner;

public class FriendInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FriendInfoHandler handler = new FriendInfoHandler(10);
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("*** �޴� ����  ***");
			System.out.println(Menu.INSERT_HIGH+". �� ģ�� ���� ����");//�� ���ĵ� ����
			System.out.println("2. ���� ģ�� ���� ����");
			System.out.println("3. ��ü ���� ���");
			System.out.println("4. �⺻ ���� ���");
			System.out.println("5. EXIT");
			System.out.println("�����ϼ���>> ");
			
			int choice = sc.nextInt();
			switch(choice) {
			case Menu.INSERT_HIGH: case Menu.INSERT_UNIV:
				handler.addFriends(choice);
				break;
			case Menu.SHOW_ALL:
				handler.showAllData();
				break;
			case Menu.SHOW_BASEIC:
				handler.showAllSimpleData();
				break;
			case Menu.EXIT:
				break;
			default:
				System.out.println("1~5�߿� ������ �ּ���");
				break;
			}
			
		}

	}

}
