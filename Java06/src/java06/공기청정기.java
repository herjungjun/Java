package java06;

public class 공기청정기 {
	String shape;
	String company;
	int price;
	
	//생성자 3개 (shape, shape & price, shape & company & price)
	public 공기청정기(String shape) {
		this.shape = shape;
	}

	public 공기청정기(String shape, int price) {
		this.shape = shape;
		this.price = price;
	}

	public 공기청정기(String shape, String company, int price) {
		this.shape = shape;
		this.company = company;
		this.price = price;
	}
	
	//toString 재정의(overriding, 오버라이딩)
	public String toString() {
		return "공기청정기 [shape : " + shape + ", company : " + company + ", price : " + price + "]" ;
	}
}
