package product;

public class Product {
	int price;
	int bonusPoint;
	//������
	public Product(int price) {
		this.price=price;
		this.bonusPoint=(int)(price*0.1f);
	}
	@Override
	public String toString() {
		return "Product [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	

	
	
	


}
