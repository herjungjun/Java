package »ó¼Ó;

public class TruckUser {

	public static void main(String[] args) {
			Truck truck = new Truck();
			truck.color = "green";
			truck.speed = 150;
			truck.weight = 1;
			
			System.out.println(truck);
			truck.speedUp();
			System.out.println(truck.speedDown());
			truck.move();
	}

}
