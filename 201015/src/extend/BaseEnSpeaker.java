package extend;

public class BaseEnSpeaker extends Speaker{
	private int baseRate;
	
	public void setBaseRate(int base) {
		baseRate= base;
	}
	//�������̵�: ��Ӱ��迡�� ��ӹ��� �޼����� ����δ� �����ϰ� �ϰ� ó���θ� �� ���� �ϴ°�
	//�����ε�: ������ ���� ���ο� �޼��� �����ϴ� ��, �̸��� ������ �Ű������� ������ Ÿ���� �ٸ� �޼��� 
	//����Ŭ������ ���� ������ ���� Ŭ������ �ν��Ͻ� ���� ���� (������ 123�ְ� ������ 123456������ ������ 123�� �̿��ϴ°�. )
	@Override
	void showCurrentState() {
		System.out.println("�޼��� ó���κ��� �����Ͽ����ϴ�");
		super.showCurrentState();
		System.out.println("���̽�ũ��: "+ baseRate);
	}
}
