package ���;

//������� ���� : 3��, ����޼ҵ� ���� : 3��
public class Truck extends Car {
	int weight; // ������� �߰�

	public void move() { // ��� �޼ҵ� �߰�
		System.out.println("������ ����ϴ�.");
	}
	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", color=" + color + ", speed=" + speed + "]";
	}

}
