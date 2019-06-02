package java06;

import java.io.File;
import java.io.FileWriter;

public class 파일다루기2 {

	public static void main(String[] args) throws Exception {
		FileWriter file = new FileWriter("c:/temp/20190602.txt");
		file.write("hi...\r\n");
		file.write("안녕...\r\n");
		file.close();
	}

}
