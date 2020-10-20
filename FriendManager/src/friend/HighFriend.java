package friend;

public class HighFriend extends Friend{
	
	private String work; //����â�� ����
	
	HighFriend(String name, String pNum, String addr, String work){
		super(name, pNum, addr);
		this.work=work;
	}

	
	
	
	@Override
	public void showData() { //Friend f = HighFriend() -> f.showData()
		// TODO Auto-generated method stub
		super.showData();
		System.out.println("����: "+work);
	}

	@Override
	public void showBasicInfo() {
		// TODO Auto-generated method stub
		super.showBasicInfo();
		System.out.println("�̸�: "+getName());
		System.out.println("��ȭ: "+getPhoneNumber());
		//System.out.println("�ּ�: "+getAddr());
	}

}
