package friend;

public class Friend {
	
	//private�� ������ ���������� ����
	private String name;		//ģ���� �̸� 
	private String phoneNumber; //��ȭ��ȣ
	private String addr;		//�ּ�
	
	//�����ڸ� ���ؼ� �ν��Ͻ� �������� �ʱ�ȭ
	Friend(String name, String pNum, String addr){
		this.name= name;
		this.phoneNumber=pNum;
		this.addr=addr;
	}
	
	
	public String getName() {
		return name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public String getAddr() {
		return addr;
	}


	//�������̵� ó��: ����ϴ� Ŭ������ �߰� �Ӽ��� ���
	public void showData() {
		System.out.println("�̸�: "+ name);
		System.out.println("��ȭ: "+ phoneNumber);
		System.out.println("�ּ�: "+ addr);
	}
	
	//�������̵�: ����ִ� ó���θ� ����� �߰�
	//public abstract void showBasicInfo();
	public void showBasicInfo() {}

}
