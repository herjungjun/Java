package java08;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList List = new ArrayList();
		List.add("�ڽ�Ű");
		List.add("�۽�Ű");
		List.add("�轺Ű");
		List.add("����Ű");
//		List.add(100);
		
		System.out.println(List.size());
		System.out.println(List);
		List.remove(1);
		System.out.println(List);
		System.out.println(List.size());
		
		
	}

}
