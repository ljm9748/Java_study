package ver06;

public class PhoneUnivInfor extends PhoneInfor{
	
	
	private String email;
	private String major;
	private String year;
	
	public PhoneUnivInfor(String name, String phoneNumber, String address, String email, String major, String year) {
		super(name, phoneNumber, address, email);
		this.major=major;
		this.year=year;
		// TODO Auto-generated constructor stub
	}


	@Override
	public void showInfor() {
		// TODO Auto-generated method stub
		super.showInfor();
		System.out.println("전공: " +major);
		System.out.println("학년: " +year);
		
	}


	@Override
	public void showBasicInfor() {
		// TODO Auto-generated method stub
		super.showInfor();
	}
	
	

}
