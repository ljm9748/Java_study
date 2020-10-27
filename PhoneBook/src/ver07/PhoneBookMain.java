package ver07;

import java.util.InputMismatchException;

public class PhoneBookMain implements Util, Menu{

	public static void main(String[] args) {
		//PhoneBookManager manager = new PhoneBookManager(100);
		PhoneBookManager manager= PhoneBookManager.getInstance();

		int select=0;
		while(true) {
			
		System.out.println("��ȭ��ȣ ���� ���α׷�=============");
		System.out.println("�޴��� �Է��ϼ���");
		System.out.println(INSERT+". ����");
		System.out.println(SEARCH+". �˻�");
		System.out.println(DELETE+". ����");
		System.out.println(DISPLAY_ALL+". ��� ���� ���");
		System.out.println(SAVE+". ��� ���� ����(FILE�� ����)");
		System.out.println(EXIT+". EXIT");
		System.out.println("=============================");
		
		//char insertMenu= Util.sc.nextLine().charAt(0);
		
		try {
		 select= SC.nextInt();
		
		if(!(select>0 && select<7)) {
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
			case INSERT:
				manager.insertInfo();
				break;
			case SEARCH:
				manager.searchInfo();
				break;
			case DELETE:
				manager.deleteMember();
				break;
			case DISPLAY_ALL:
				manager.displayAll();
				break;
			case SAVE:
				manager.save();
				break;
			case EXIT:
				System.out.println("���α׷��� �����մϴ�.");
				return;
				//System.exit(0);
			default:
				break;
			}
		

		}

	}

}
