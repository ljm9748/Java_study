package first;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 ="My String";
		String str2 ="My String";
		String str3 ="Your String";
		String str4 = new String("My String");//내용은 같은데 다른 인스턴스를 참조하고 싶은 경우!
		
		//참조변수 값의 동등 비교: 같은 인스턴스를 참조한다
		if(str1==str2) {
			System.out.println("같은 인스턴스 참조");
		}else {
			System.out.println("다른 인스턴스 참조");
		}
		
		if(str1==str3) {
			System.out.println("같은 인스턴스 참조");
		}else {
			System.out.println("다른 인스턴스 참조");
		}
		
		if(str1==str4) {
			System.out.println("같은 인스턴스 참조");
		}else {
			System.out.println("다른 인스턴스 참조");
		}


	}

}
