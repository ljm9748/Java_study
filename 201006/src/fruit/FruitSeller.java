package fruit;

public class FruitSeller {


		// Ŭ�������� ����+�ż��� ����
		//������ ���� ���� �޼��� ����
		
		//����: �ν��Ͻ� ����, �������
		final int APPLE_PRICE=1000;//����� ����-���� �Ұ��� ����� ����
		int numOfApple=20;// ����� ����
		int myMoney=0; //���ͱݾ�
		
		//���: �Ǹ�, �������
		//�Ǹ� �޼���: ���ް� ��ȯ�ϴ� ����� ����, ���Ա� ���� ������ ����� ������ ����->����� ���� ����
		
		
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
