package java06;

import java.io.File;

public class 파일다루기 {

	public static void main(String[] args) {
		//컴퓨터는 String을 파일로 인식
		File f = new File("c:/temp");
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
	}

}
