package first;

public class BlockTest {
	static int[] arr = new int[10];
	static {
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
		}
		System.out.println("배열의 초기화 작업 완료");
	}
	
	//클래스 초기화 블록: 코드가 로드될 때 블록의 코드가 실행 무조건한번 실행됨 static은 static에서만 쓸수있음
	static {
		System.out.println("static {123}");
	}
	
	//인스턴스 초기화 블록: 인스턴스가 생성될 때 블록의 코드가 실행, 생성자보다 우선한다
	{
		System.out.println("{ }");
	}

	BlockTest(){
		System.out.println("생성자");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BlockTest 인스턴스 생성");
		BlockTest bt1 = new BlockTest();
		
		System.out.println("BlockTest 인스턴스 생성");
		BlockTest bt2 = new BlockTest();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d\n",i, arr[i]);
		}
	}

}
