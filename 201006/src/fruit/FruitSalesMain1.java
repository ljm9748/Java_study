package fruit;

public class FruitSalesMain1 {

	public static void main(String[] args) {
		// seller,buyer ��ü ����
		FruitSeller seller=null;
		FruitBuyer buyer=null;
		//��ü ������ Ŭ������ ������ ����� �޸𸮿� ����ϴ°�
		seller=new FruitSeller();
		buyer=new FruitBuyer();
		
		FruitSeller seller2=new FruitSeller(seller);
		
		buyer.buyApple(seller, 2000);
		
		System.out.println("�Ǹ����� ���� ��ǥ");
		seller.showSaleResult();
		
		System.out.println("======================");
		System.out.println("�Ǹ���2�� ���� ��ǥ");
		seller2.showSaleResult();
		
		System.out.println("======================");
		
		System.out.println("�������� ���� ��ǥ");
		buyer.showBuyResult();
		
		

	}


}
