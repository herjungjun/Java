package ���;

public class �ڵ���User {

	public static void main(String[] args) {
		���� sedan = new ����();
		sedan.color = "black";
		sedan.name = "����";
		
		System.out.println(sedan);
		sedan.start();
		sedan.stop();
		sedan.window();
		
		System.out.println("-------------------------");
		
		Ʈ�� truck = new Ʈ��();
		truck.color = "white";
		truck.name = "Ʈ��";
		System.out.println(truck);
		truck.start();
		truck.stop();
		truck.move();
	}

}
