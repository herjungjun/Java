package ���;

public class Car {
//	�ڵ��� �� class

//		- ����Ư¡ : ��, �ӵ� �� �������
	String color;
	int speed;

	public Car() { // �⺻ ������
		
	}

	public Car(String color) {
		this.color = color;
	}

	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

//		- ����Ư¡ : �ӵ��� up, �ӵ��� down �� ����޼ҵ� 
	public void speedUp() {
		System.out.println("�ӵ��� Up");
	}

	public int speedDown() {
		return 60;
	}

	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + "]";
	}

}
