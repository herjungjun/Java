package java08;

import java.util.HashMap;

public class Phone {

	public static void main(String[] args) {
		HashMap phone = new HashMap();
		
		phone.put(1, "����");
		phone.put(2, "�ƺ�");
		phone.put(3, "ģ��");
		phone.put(4, "����");
		
		System.out.println(phone.get(2));
	}

}
