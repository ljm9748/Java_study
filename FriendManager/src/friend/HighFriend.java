package friend;

public class HighFriend extends Friend{
	
	private String work; //고교동창의 직업
	
	HighFriend(String name, String pNum, String addr, String work){
		super(name, pNum, addr);
		this.work=work;
	}

	
	
	
	@Override
	public void showData() { //Friend f = HighFriend() -> f.showData()
		// TODO Auto-generated method stub
		super.showData();
		System.out.println("직업: "+work);
	}

	@Override
	public void showBasicInfo() {
		// TODO Auto-generated method stub
		super.showBasicInfo();
		System.out.println("이름: "+getName());
		System.out.println("전화: "+getPhoneNumber());
		//System.out.println("주소: "+getAddr());
	}

}
