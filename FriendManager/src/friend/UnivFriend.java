package friend;

public class UnivFriend extends Friend{
	private String major;	//ģ���� ����
	

	UnivFriend(String name, String pNum, String addr,String major) {
		super(name, pNum, addr);
		// TODO Auto-generated constructor stub
		this.major= major;
	}


	
	
	//�������̵�
	public void showData() {
		super.showData();
		System.out.println("����: "+major);
	}
	
	//�������̵�
	public void showBasicInfo() {
		System.out.println("�̸�: "+getName());
		System.out.println("��ȭ: "+getPhoneNumber());
		System.out.println("����: "+major);
	}
}
