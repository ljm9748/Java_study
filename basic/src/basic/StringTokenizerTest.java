package basic;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String strData="1:22:3:4:55";
		StringTokenizer st = new StringTokenizer(strData,":");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
		st = new StringTokenizer(strData,":", true);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
		
	}
}
