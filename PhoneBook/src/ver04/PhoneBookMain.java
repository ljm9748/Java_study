package ver04;

public class PhoneBookMain {

	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager(100);


		while(true) {
			
		System.out.println("��ȭ��ȣ ���� ���α׷�=============");
		System.out.println("�޴��� �Է��ϼ���");
		System.out.println("1. ����");
		System.out.println("2. �˻�");
		System.out.println("3. ����");
		System.out.println("4. ��� ���� ���");
		System.out.println("5. EXIT");
		System.out.println("=============================");
		
		//char insertMenu= Util.sc.nextLine().charAt(0);
		int select = Util.sc.nextInt();
		Util.sc.nextLine();
		if(!(select>0 && select<6)) {
			System.out.println("�޴������� �ùٸ��� �ʽ��ϴ�");
			System.out.println("�ٽ� ������ �ּ���");
			continue;
		}
		
			switch(select) {
			case 1:
				manager.insertInfo();
				break;
			case 2:
				manager.searchInfo();
				break;
			case 3:
				manager.deleteMember();
				break;
			case 4:
				manager.displayAll();
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				return;
				//System.exit(0);
			default:
				break;
			}
		

		}

	}

}
