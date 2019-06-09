package 형변환;

import java.util.ArrayList;

public class 형변환2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		String name = (String)list.get(0);
		Integer num = (Integer)list.get(1);
	}

}
