package java08;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap member = new HashMap();
		member.put("park", "1234");
		member.put("kim", "kim12");
		member.put("lee", "lee00");
		
		System.out.println(member);
		System.out.println(member.get("park"));
		
	}

}
