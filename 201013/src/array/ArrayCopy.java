package array;

public class ArrayCopy {
	public static void main(String[] args) {
		char[] arr1={'a','b'};
		char[] arr2= {'1'};
		
		char[] result= new char[arr1.length+arr2.length];
		
		System.arraycopy(arr1, 0, result, 0, arr1.length);
		System.arraycopy(arr2, 0, result, arr1.length, arr2.length);//�Ӹ�, ������, ���, ������ ������ġ, ����
		System.out.println(result);
		
		
	}

}
