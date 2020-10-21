package ver05;

public class PhoneCafeInfor extends PhoneInfor {
	private String cafeName;
	private String nickName;

	public PhoneCafeInfor(String name, String phoneNumber, String address, String email, String cafeName, String nickname) {
		super(name, phoneNumber, address, email);
		this.cafeName=cafeName;
		this.nickName=nickname;
	}

	public String getCafeName() {
		return cafeName;
	}

	public String getNickName() {
		return nickName;
	}

	@Override
	public void showInfor() {
		// TODO Auto-generated method stub
		super.showInfor();
		System.out.println("��ȣȸ�̸�: "+cafeName);
		System.out.println("�г���: "+nickName);
	}

	@Override
	public void showBasicInfor() {
		// TODO Auto-generated method stub
		super.showInfor();
		
	}

	
}
