package generic;

public class FruitBoxMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FruitBox box1= new FruitBox<Apple>(new Apple(100));
		//box1.store(new Apple(100));
		Apple apple= (Apple)box1.pullOut();
		apple.showWeight();
		
		
		FruitBox box2= new FruitBox<Orange>(new Orange(100));
		//box2.store(new Orange(100));
		Orange orange= (Orange)box2.pullOut();
		orange.showSugarContent();;
	
	}

}
