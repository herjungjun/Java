package java06;

public class Car2 {
//	����Ư¡
	String color;
	int price;

//	������ : ��ü����(new)�� �� �ڵ����� �ʱ�ȭ
//	��ü ������ ��, �ڵ����� ȣ��(����)
//	Ŭ���� �̸��� ����, �빮�ڷ� �����ϴ� ������ �޼ҵ�

//	color�� ������
	public Car2(String color) {
		this.color = color;
	}
//	price�� ������
	public Car2(int price) {
		this.price = price;
	}
//	color, price ������
	public Car2(String color, int price) {
		this.color = color;
		this.price = price;
	}

//	����Ư¡
	public void speedup() {
		System.out.println("�ӵ��� Up...");
		System.out.println("300���� �ӵ��� Up...");
	}

	public int get() {
		return 300;
	}
	
	public String toString() {
		return "Car2 [color : " + color + ", price : " + price + "]";
	}
}
