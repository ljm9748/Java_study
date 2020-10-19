package product;

public class Buyer { // 자동으로 object 클래스를 상속한다
	private int money;
	private int bonusPoint=0;
	
	//구매한 제품을 담을 배열 생성
	Product[] cart= new Product[10];
	
	int cnt =0;
	
	
	
	public Buyer() {
		this(1000);
	}
	public Buyer(int money) {
		this.money=money;
		this.bonusPoint=0;
	}

	void buy(Product p) {
		//Product p1= new Tv(100);
		//Product p2= new Computer(100);
		//Product p3= new Audio(100);
		
		if(money<p.price) {
			System.out.println("보유한 돈이 부족해 구매불가합니다");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		//cart에 제품을 넣는다
		cart[cnt]=p;
		cnt++;
		
		System.out.println(p+"를 구입하였습니다.");
	}
	
	void showData() {

		
		//구매목록 출력, 구매 총액
		int sum=0;
		
		System.out.println("구매목록 =======================");

		for (int i = 0; i < cnt; i++) {
			System.out.println(cart[i]);
			sum += cart[i].price;
		}
		System.out.println("==============================");
		System.out.println("총구매액: "+ sum); 	
		System.out.println("남은돈: "+money);
		System.out.println("포인트: "+bonusPoint);
		
	}
}
