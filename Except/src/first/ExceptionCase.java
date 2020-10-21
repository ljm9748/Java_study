package first;

public class ExceptionCase {

	
	public static void main(String[] args) {
		
		
		try {
			int[] arr = new int[3];
			arr[-1]=20;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		try {
			int[] arr2 = new int[-3];
		} catch (NegativeArraySizeException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		try {
			Object obj= new int[10];
			String str= (String)obj;
		} catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		try {
			String str2= null;
			int len= str2.length();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("메소드가 종료됩니다.");
		
	}
}
