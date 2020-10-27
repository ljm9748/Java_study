package ver06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class PhoneBookManager implements Util{
	
	//private PhoneInfor[] phoneBook;
	//private int cnt;//  ����� ���� ����
	
	List<PhoneInfor> phoneBook;
	
	//������: �̱��� ó�� -> �ܺο��� �ν��Ͻ� ������ ����(private)
	private PhoneBookManager(int num){
		//phoneBook = new PhoneInfor[num]; //�������� �Ű������� ���ڸ� ���޹޾� �迭 ����
		//cnt=0;
		
		//List<PhoneInfor> �ʱ�ȭ
		phoneBook = new ArrayList<PhoneInfor>();
	}
	//���ο��� �ν��Ͻ� ����
	private static PhoneBookManager manager= new PhoneBookManager(100);
	
	//�ܺο��� ���������� ���� �� �ִ� �޼���
	public static PhoneBookManager getInstance() {
		return manager;
	}

	void addInfor(PhoneInfor info) {
		//List�� ���� ����
		phoneBook.add(info);
	}
	
	void insertInfo() {
		
		/*
		if(phoneBook.length==cnt) {
			System.out.println("���̻� ������ ������ �� �����ϴ�.\n �Ϻ� ������ �����ϰ� ���� ������ Ȯ���� �ּ���.");
			return;
			
		}
		List�� ��������� �����ϸ� ��������� Ȯ��
		*/ 
		int select=0;
		while(true) {
			System.out.println("���� �Է��� �����մϴ�");
			System.out.println("� ������ �Է��Ͻðڽ��ϱ�?");
			//System.out.println("1. �⺻");  //�߻�Ŭ����->�ν��Ͻ� �����Ұ�
			System.out.println(Menu.UNIV+". ����");
			System.out.println(Menu.COM+". ȸ��");
			System.out.println(Menu.CAFE+". ��ȣȸ");
			System.out.println("=====================================");
			
			try {
				select = SC.nextInt();
				SC.nextLine();//���ۺ�������	
				if(!(select>0 && select<5)) {

					BadInputException e= new BadInputException(String.valueOf(select));
					throw e;
				}
					
			} catch(InputMismatchException | BadInputException e) {
				System.out.println("�߸��� �޴��Է��Դϴ� �ٽ� �������ּ���");
				SC.nextLine();
				continue;
			
			
			}
			break;
		}
		System.out.println("ģ���� ���� �Է��� �����մϴ�");
		System.out.println("�̸� >> ");
		String name=SC.nextLine();
		System.out.println("��ȭ��ȣ>> ");
		String num=SC.nextLine();
		System.out.println("�ּ�>> ");
		String address=SC.nextLine();
		System.out.println("�̸���>> ");
		String email=SC.nextLine();

		select = SC.nextInt();
		
		switch(select) {
//			case 1: 
//				addInfor(new PhoneInfor(name, num, address, email));
//
//				break;
			case Menu.UNIV:
				System.out.println("����>> ");
				String major=SC.nextLine();
				System.out.println("�г�>> ");
				String year=SC.nextLine();
				addInfor(new PhoneUnivInfor(name, num, address, email, major, year));
				break;
			case Menu.COM:
				System.out.println("ȸ���̸�>> ");
				String company=SC.nextLine();
				addInfor(new PhoneCompanyInfor(name, num, address, email, company));
				break;
			case Menu.CAFE:
				System.out.println("��ȣȸ �̸�>> ");
				String club=SC.nextLine();
				System.out.println("�г���>> ");
				String nickname=SC.nextLine();
				addInfor(new PhoneCafeInfor(name, num, address, email, club, nickname));
				break;
			default:
				System.out.println("1~4 ������ ���ڸ� �Է��� �ּ���");
				break;
		}
		System.out.println("�Է��Ͻ� ������ ����Ǿ����ϴ�.");
		
	}
	
	//List�� indexã��
	private int searchIndex(String name) {
		int index = -1; //ã�����ϴ� �ε���
		
		//�˻�
		for (int i = 0; i <phoneBook.size(); i++) {
			if(phoneBook.get(i).getName().equals(name)) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	void searchInfo() { // �����˻�, �˻��ϰ����ϴ� �̸� �ް� �迭��� ������ ���� �˻� �̸� ��(�����), �ش� index ã�� �˻��� index�� �������
		
		//�ƿ� ������ ���� ���
		if(phoneBook.size()==0) {
			System.out.printf("������ �����ϴ�");
			return;
			}
		//�Է�
		System.out.println("���� �˻��� �����մϴ�");
		System.out.println("ã�����ϴ� �Է��� �Է��� �ּ��� : ");
		String name= SC.nextLine();
		int index=searchIndex(name);
		
		
		//���
		if(index<0) {
			System.out.printf("�Է��Ͻ� �̸� %s�� ������ �����ϴ�\n", name);
			System.out.println("�޴��� ���ư��ϴ�.");
		}else {
			phoneBook.get(index).showInfor();
		}
		
	}
	
	void deleteMember() {
		
		//�ƿ� ������ ���� ���
		if(phoneBook.size()==0) {
			System.out.println("������ �����ϴ�");
			System.out.println("�ʱ�޴��� �̵��մϴ�");
			return;
			}
		System.out.println("���������� �����մϴ�");
		System.out.println("�����ϰ���� �̸��� �Է��ϼ���: ");
		
		String name= SC.nextLine();
		
		int index = searchIndex(name);
		
		//���
		if(index<0) {
			System.out.println("�����ϰ����ϴ´� �̸��� ������ �������� �ʽ��ϴ�");
			System.out.println("�ʱ�޴��� �̵��մϴ�");
		}else {
			phoneBook.remove(index);
			System.out.println("�ش� ������ �����߽��ϴ�");
		}
		
	}
	
	void displayAll() {
		//�ƿ� ������ ���� ���
		if(phoneBook.size()==0) {
			System.out.println("������ �����ϴ�");
			return;
			}
		System.out.println("��ü ������ ����մϴ�");
		for (int i = 0; i < phoneBook.size(); i++) {
			phoneBook.get(i).showInfor();
			System.out.println("===================");
			
		}
	} 
	



}
