package ver05;

public class PhoneCompanyInfor extends PhoneInfor{
	
	private String company; 

	public PhoneCompanyInfor(String name, String phoneNumber, String address, String email, String company) {
		super(name, phoneNumber, address, email);
		this.company=company;
	}

	@Override
	public void showInfor() {
		// TODO Auto-generated method stub
		super.showInfor();
		System.out.println("È¸»ç: "+company);
	}

	@Override
	public void showBasicInfor() {
		// TODO Auto-generated method stub
		super.showInfor();
	}
	

}
