package thread;

public class Sum {
	
	int num;
	Sum(){
		num=0;
	}

	//synchronized: �������� ���°� �� �ȿ� �־� ���� �̿��� ������ ó���� �����ϴ� synchronized(this)���� this�� ����ȭ��
	//����� �˸��� �뵵
	synchronized void addNum(int n) {
		num += n;
	}
	
	int getNum() {
		return num;
	}
}
