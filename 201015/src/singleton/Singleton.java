package singleton;
//�̱����� private�� ���� static�����ؼ� �ϳ��� �����ְ� �ϱ�
public class Singleton {
	//�ܺ� �ν��Ͻ����� �ν��Ͻ��� �������� ���ϵ��� ����
	private Singleton() {}
	//����� �ν��Ͻ��� ��Ŭ���� ���ο��� ����
	private static Singleton s= new Singleton();
	//�ܺο��� ������� �������� ����� �� �ֵ��� ������ ����
	public static Singleton getInstance() {
		if (s==null) {
			s= new Singleton();
		}
		return s;
	}

}
