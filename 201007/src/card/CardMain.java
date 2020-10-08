package card;

public class CardMain {

	public static void main(String[] args) {
		Card c1= new Card("clober", 3);
		Card c2= new Card();
		
		System.out.println("=======================");
		System.out.println("카드1의 정보");
		System.out.println("모양: "+c1.kind+ " 숫자:"+c1.number);
		System.out.println("카드2의 정보");
		System.out.println("모양: "+c2.kind+ " 숫자:"+c2.number);
		System.out.println("=======================");
		
		c1.play();
		System.out.println();
	}
}
