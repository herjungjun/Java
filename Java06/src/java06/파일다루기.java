package java06;

import java.io.File;

public class ���ϴٷ�� {

	public static void main(String[] args) {
		//��ǻ�ʹ� String�� ���Ϸ� �ν�
		File f = new File("c:/temp");
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
	}

}
