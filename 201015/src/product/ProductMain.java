package product;

public class ProductMain {
	public static void main(String[] args) {
		//System.out.println(new Product(200).toString());
		//System.out.println(new Tv(100).toString());
		
		Buyer b = new Buyer();
		
		String str="";
		
		Tv tv =new Tv(100);
		Computer com = new Computer(80);
		Audio audio= new Audio(50);
		
		b.buy(tv);  // Product p = new Tv();
		b.buy(com);
		b.buy(audio);
		
		b.showData();
		
		
	}

}
