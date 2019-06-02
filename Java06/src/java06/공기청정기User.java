package java06;

public class 공기청정기User {

	public static void main(String[] args) {
		공기청정기 user1 = new 공기청정기("세모");
		System.out.println(user1);
		공기청정기 user2 = new 공기청정기("동그라미", 50);
		System.out.println(user2);
		공기청정기 user3 = new 공기청정기("네모", "LG", 100 );
		System.out.println(user3);
	}

}
