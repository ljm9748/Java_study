package card;

public class CardMain {

	public static void main(String[] args) {
		Card c1= new Card("clober", 3);
		Card c2= new Card();
		
		System.out.println("=======================");
		System.out.println("ī��1�� ����");
		System.out.println("���: "+c1.kind+ " ����:"+c1.number);
		System.out.println("ī��2�� ����");
		System.out.println("���: "+c2.kind+ " ����:"+c2.number);
		System.out.println("=======================");
		
		c1.play();
		System.out.println();
	}
}
