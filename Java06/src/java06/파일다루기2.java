package java06;

import java.io.File;
import java.io.FileWriter;

public class ���ϴٷ��2 {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("c:/temp/20190602.txt");
		file.write("hi...\r\n");
		file.write("�ȳ�...\r\n");
		file.close();
	}

}
