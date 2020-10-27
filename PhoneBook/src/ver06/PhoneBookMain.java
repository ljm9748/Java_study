package ver06;

import java.util.InputMismatchException;

public class PhoneBookMain implements Util{

	public static void main(String[] args) {
		//PhoneBookManager manager = new PhoneBookManager(100);
		PhoneBookManager manager= PhoneBookManager.getInstance();

		int select=0;
		while(true) {
			
		System.out.println("��ȭ��ȣ ���� ���α׷�=============");
		System.out.println("�޴��� �Է��ϼ���");
		System.out.println(Menu.INSERT+". ����");
		System.out.println(Menu.SEARCH+". �˻�");
		System.out.println(Menu.DELETE+". ����");
		System.out.println(Menu.DISPLAY_ALL+". ��� ���� ���");
		System.out.println(Menu.EXIT+". EXIT");
		System.out.println("=============================");
		
		//char insertMenu= Util.sc.nextLine().charAt(0);
		
		try {
		 select= SC.nextInt();
		
		if(!(select>0 && select<6)) {
			System.out.println("�޴������� �ùٸ��� �ʽ��ϴ�");
			System.out.println("�ٽ� ������ �ּ���");
			BadInputException e= new BadInputException(String.valueOf(select));
			throw e;
			
		}
		}catch(InputMismatchException | BadInputException e) {
			System.out.println("�޴��� ������ �߸��Ǿ����ϴ�");
			SC.nextLine();
			continue;
		}catch(Exception e1) {
			
			e1.printStackTrace();
			System.out.println("�޴��� ������ �߸��Ǿ����ϴ�");
			SC.nextLine();
			continue;
		}
		SC.nextLine();
			switch(select) {
			case Menu.INSERT:
				manager.insertInfo();
				break;
			case Menu.SEARCH:
				manager.searchInfo();
				break;
			case Menu.DELETE:
				manager.deleteMember();
				break;
			case Menu.DISPLAY_ALL:
				manager.displayAll();
				break;
			case Menu.EXIT:
				System.out.println("���α׷��� �����մϴ�.");
				return;
				//System.exit(0);
			default:
				break;
			}
		

		}

	}

}
