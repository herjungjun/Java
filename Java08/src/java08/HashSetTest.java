package java08;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
//		�ߺ����X
		HashSet bag = new HashSet();
		bag.add("�޴���");
		bag.add("����");
		bag.add("����");
		System.out.println(bag);
		bag.add("����");
		System.out.println(bag);
		
	}

}
