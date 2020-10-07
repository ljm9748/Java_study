package fruit;

public class FruitSalesMain1 {

	public static void main(String[] args) {
		// seller,buyer 객체 생성
		FruitSeller seller=null;
		FruitBuyer buyer=null;
		//객체 생성은 클래스에 정의한 멤버를 메모리에 등록하는것
		seller=new FruitSeller();
		buyer=new FruitBuyer();
		
		buyer.buyApple(seller, 2000);
		
		System.out.println("판매자의 현재 지표");
		seller.showSaleResult();
		
		System.out.println("======================");
		
		System.out.println("구매자의 현재 지표");
		buyer.showBuyResult();
		
		

	}

}
