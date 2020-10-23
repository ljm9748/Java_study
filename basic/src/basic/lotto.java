package basic;

import java.util.Random;

public class lotto {
	
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		Random r3= new Random(System.currentTimeMillis());
		System.out.println(r3.nextInt(45)+1);
		
	}
	


}
