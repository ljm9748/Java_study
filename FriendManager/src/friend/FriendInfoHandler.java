package friend;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class FriendInfoHandler {
	
	//친구 정보 저장 배열
	private Friend[] friends; //친구의 정보를 저장하는 배열
	private int numOfFriends=0; //저장된 친구의 정보개수, 배열의 요소 추가시 index로 사용
	
	//배열에 친구 정보를 저장하는 기능
	public FriendInfoHandler(int num) {
		friends = new Friend[num];
		numOfFriends=0;
	}
	//배열에 친구 정보를 저장하는 기능: 다형성을 이용한 매개변수 정의
	void addFriendInfo(Friend f) {
		friends[numOfFriends++]=f;
		
	}
	
	//고교친구:1, 대학친구:2
	void addFriends(int choice) {
		//사용자로부터 기본 정보를 입력받자: 이름, 전화번호, 주소
		Scanner sc= new Scanner(System.in);
		
		System.out.println("친구 정보의 입력을 시작합니다");
		System.out.println("이름을 입력해 주세요 >> ");
		String name= sc.nextLine();
		System.out.println("전화번호를 입력해 주세요 >> ");
		String pnum= sc.nextLine();
		System.out.println("주소를 입력해 주세요 >> ");
		String addr= sc.nextLine();
		
		if (choice==1) {
			System.out.println("직업을 입력해 주세요 >> ");
			String work= sc.nextLine();
			HighFriend f= new HighFriend(name, pnum, addr, work);
			addFriendInfo(f);
		}
		else {
			System.out.println("전공을 입력해 주세요 >> ");
			String major= sc.nextLine();
			UnivFriend f= new UnivFriend(name, pnum, addr, major);
			addFriendInfo(f);
		}
		System.out.println("입력이 완료됐습니다\n");
		
		
	}
	
	//전체 정보를 출력하는 메서드: showData()
	public void showAllData() {
		System.out.println("전체 데이터를 출력합니다. ==================================");
		for (int i = 0; i < numOfFriends; i++) {
			//if(friends[i] instanceof UnivFriend) {
			//	((UnivFriend)friends[i]).showData();
			//}
			//
			friends[i].showData();
			System.out.println("-------------------------------");
		}
	}
	
	//기본정보를 출력하는 메서드
	public void showAllSimpleData() {
		System.out.println("전체 데이터를 출력합니다. ==================================");
		for (int i = 0; i < numOfFriends; i++) {
			friends[i].showBasicInfo();
			System.out.println("-------------------------------");
		}
	}

}
