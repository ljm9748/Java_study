package fruit;

public class FruitSeller {


		// Ŭ�������� ����+�ż��� ����
		//������ ���� ���� �޼��� ����
		
		//����: �ν��Ͻ� ����, �������
		final int APPLE_PRICE;//����� ����-���� �Ұ��� ����� ����
		int numOfApple;// ����� ����
		int myMoney; //���ͱݾ�
		
		//���: �Ǹ�, �������
		//�Ǹ� �޼���: ���ް� ��ȯ�ϴ� ����� ����, ���Ա� ���� ������ ����� ������ ����->����� ���� ����
		
		//������ �߰�
		FruitSeller(){
			this(0,20,1000);
		}
		FruitSeller(int money, int num, int price){
			APPLE_PRICE=price;
			numOfApple=num;
			myMoney=money;
		}
		FruitSeller(FruitSeller seller){
			//APPLE_PRICE=seller.APPLE_PRICE;
			//numOfApple=seller.numOfApple;
			//myMoney=seller.myMoney;
			this(seller.myMoney,seller.numOfApple,seller.APPLE_PRICE);
		}
		
	int saleApple(int money){
		int num=0; // ��ȯ�� ����� ����
		
		//��ȯ�� ����� ������ ����
		myMoney+=money;
		numOfApple -=num;
		return num;
	}

	//�������: ������ ����� ���� ���, ������ �ݾ� ���
	void showSaleResult() {
		System.out.println("���� ������ ����� ����: "+numOfApple);
		System.out.println("�Ǹ� ���� �ݾ�:"+ myMoney);
	}
	
}
