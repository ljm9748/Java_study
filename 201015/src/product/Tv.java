package product;

public class Tv extends Product{
	
	public Tv(int price) {
		super(price);
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "TV"+"["+price+"]";
	}

}
