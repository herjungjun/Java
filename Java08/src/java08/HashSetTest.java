package java08;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
//		Áßº¹Çã¿ëX
		HashSet bag = new HashSet();
		bag.add("ÈŞ´ëÆù");
		bag.add("ÈŞÁö");
		bag.add("º¼Ææ");
		System.out.println(bag);
		bag.add("º¼Ææ");
		System.out.println(bag);
		
	}

}
