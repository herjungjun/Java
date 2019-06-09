package 형변환;

public class 형변환1 {

	public static void main(String[] args) {
		byte b = 127;
		int i = b;
		//작 → 큰 (자동 형변환)
		
		int i2 = 127;
		byte b2 = (byte)i2;
		//큰 → 작 (강제형변환)
		
	}

}
