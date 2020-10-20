package friend;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class FriendInfoHandler {
	
	//ģ�� ���� ���� �迭
	private Friend[] friends; //ģ���� ������ �����ϴ� �迭
	private int numOfFriends=0; //����� ģ���� ��������, �迭�� ��� �߰��� index�� ���
	
	//�迭�� ģ�� ������ �����ϴ� ���
	public FriendInfoHandler(int num) {
		friends = new Friend[num];
		numOfFriends=0;
	}
	//�迭�� ģ�� ������ �����ϴ� ���: �������� �̿��� �Ű����� ����
	void addFriendInfo(Friend f) {
		friends[numOfFriends++]=f;
		
	}
	
	//��ģ��:1, ����ģ��:2
	void addFriends(int choice) {
		//����ڷκ��� �⺻ ������ �Է¹���: �̸�, ��ȭ��ȣ, �ּ�
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ģ�� ������ �Է��� �����մϴ�");
		System.out.println("�̸��� �Է��� �ּ��� >> ");
		String name= sc.nextLine();
		System.out.println("��ȭ��ȣ�� �Է��� �ּ��� >> ");
		String pnum= sc.nextLine();
		System.out.println("�ּҸ� �Է��� �ּ��� >> ");
		String addr= sc.nextLine();
		
		if (choice==1) {
			System.out.println("������ �Է��� �ּ��� >> ");
			String work= sc.nextLine();
			HighFriend f= new HighFriend(name, pnum, addr, work);
			addFriendInfo(f);
		}
		else {
			System.out.println("������ �Է��� �ּ��� >> ");
			String major= sc.nextLine();
			UnivFriend f= new UnivFriend(name, pnum, addr, major);
			addFriendInfo(f);
		}
		System.out.println("�Է��� �Ϸ�ƽ��ϴ�\n");
		
		
	}
	
	//��ü ������ ����ϴ� �޼���: showData()
	public void showAllData() {
		System.out.println("��ü �����͸� ����մϴ�. ==================================");
		for (int i = 0; i < numOfFriends; i++) {
			//if(friends[i] instanceof UnivFriend) {
			//	((UnivFriend)friends[i]).showData();
			//}
			//
			friends[i].showData();
			System.out.println("-------------------------------");
		}
	}
	
	//�⺻������ ����ϴ� �޼���
	public void showAllSimpleData() {
		System.out.println("��ü �����͸� ����մϴ�. ==================================");
		for (int i = 0; i < numOfFriends; i++) {
			friends[i].showBasicInfo();
			System.out.println("-------------------------------");
		}
	}

}
