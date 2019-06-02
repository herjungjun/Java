package java06;

public class Computer {
//	정적 특징
	int price;
	String company;	
//	생성자
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
	
	//재정의
	public String toString() {
		return price + " " + company;
	}
}
