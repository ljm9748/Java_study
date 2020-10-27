package first;

public class ExceptionCase2 {

	
	public static void main(String[] args) {
		
		
		try {
			int[] arr = new int[3];
			arr[-1]=20;
			
			int[] arr2 = new int[-3];
			
			Object obj= new int[10];
			String str= (String)obj;
			
			String str2= null;
			int len= str2.length();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		 catch (NegativeArraySizeException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		 catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("메소드가 종료됩니다.");
		
	}
}
