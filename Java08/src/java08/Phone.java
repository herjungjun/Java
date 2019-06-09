package java08;

import java.util.HashMap;

public class Phone {

	public static void main(String[] args) {
		HashMap phone = new HashMap();
		
		phone.put(1, "决付");
		phone.put(2, "酒狐");
		phone.put(3, "模备");
		phone.put(4, "悼积");
		
		System.out.println(phone.get(2));
	}

}
