package java06;

public class Computer {
//	���� Ư¡
	int price;
	String company;	
//	������
	public Computer(int price) {
		this.price = price;
	}

	public Computer(String company) {
		this.company = company;
	}

	public Computer(int price, String company) {
		this.price = price;
		this.company = company;
	}
	
	//������
	public String toString() {
		return price + " " + company;
	}
}
