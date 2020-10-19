package product;

public class Buyer { // �ڵ����� object Ŭ������ ����Ѵ�
	private int money;
	private int bonusPoint=0;
	
	//������ ��ǰ�� ���� �迭 ����
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
			System.out.println("������ ���� ������ ���źҰ��մϴ�");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		//cart�� ��ǰ�� �ִ´�
		cart[cnt]=p;
		cnt++;
		
		System.out.println(p+"�� �����Ͽ����ϴ�.");
	}
	
	void showData() {

		
		//���Ÿ�� ���, ���� �Ѿ�
		int sum=0;
		
		System.out.println("���Ÿ�� =======================");

		for (int i = 0; i < cnt; i++) {
			System.out.println(cart[i]);
			sum += cart[i].price;
		}
		System.out.println("==============================");
		System.out.println("�ѱ��ž�: "+ sum); 	
		System.out.println("������: "+money);
		System.out.println("����Ʈ: "+bonusPoint);
		
	}
}
