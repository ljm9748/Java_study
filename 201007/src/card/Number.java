package card;

public class Number {

	int num;
	Number(int number){
		num=number;
		System.out.println("첫 생성자 실행");
	}
	
	Number(){
		num=10;
		System.out.println("두번째 생성자 실행"); 
	}
}
