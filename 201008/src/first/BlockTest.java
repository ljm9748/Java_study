package first;

public class BlockTest {
	static int[] arr = new int[10];
	static {
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
		}
		System.out.println("�迭�� �ʱ�ȭ �۾� �Ϸ�");
	}
	
	//Ŭ���� �ʱ�ȭ ���: �ڵ尡 �ε�� �� ����� �ڵ尡 ���� �������ѹ� ����� static�� static������ ��������
	static {
		System.out.println("static {123}");
	}
	
	//�ν��Ͻ� �ʱ�ȭ ���: �ν��Ͻ��� ������ �� ����� �ڵ尡 ����, �����ں��� �켱�Ѵ�
	{
		System.out.println("{ }");
	}

	BlockTest(){
		System.out.println("������");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BlockTest �ν��Ͻ� ����");
		BlockTest bt1 = new BlockTest();
		
		System.out.println("BlockTest �ν��Ͻ� ����");
		BlockTest bt2 = new BlockTest();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d\n",i, arr[i]);
		}
	}

}
