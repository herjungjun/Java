package 상속;

public class 자동차User {

	public static void main(String[] args) {
		세단 sedan = new 세단();
		sedan.color = "black";
		sedan.name = "세단";
		
		System.out.println(sedan);
		sedan.start();
		sedan.stop();
		sedan.window();
		
		System.out.println("-------------------------");
		
		트럭 truck = new 트럭();
		truck.color = "white";
		truck.name = "트럭";
		System.out.println(truck);
		truck.start();
		truck.stop();
		truck.move();
	}

}
