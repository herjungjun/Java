package java06;

public class ����û���� {
	String shape;
	String company;
	int price;
	
	//������ 3�� (shape, shape & price, shape & company & price)
	public ����û����(String shape) {
		this.shape = shape;
	}

	public ����û����(String shape, int price) {
		this.shape = shape;
		this.price = price;
	}

	public ����û����(String shape, String company, int price) {
		this.shape = shape;
		this.company = company;
		this.price = price;
	}
	
	//toString ������(overriding, �������̵�)
	public String toString() {
		return "����û���� [shape : " + shape + ", company : " + company + ", price : " + price + "]" ;
	}
}
