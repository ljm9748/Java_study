package generic;

public class FruitBox<T> {
	
	T fruit;
	
	public FruitBox(T fruit){
		this.fruit = fruit;
	}
	
	public void store(T fruit) {
		this.fruit=fruit;
	}
	
	public T pullOut() {
		return fruit;
	}

}
