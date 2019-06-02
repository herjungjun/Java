package java05;

public class 정보사용 {

	public static void main(String[] args) {
		String name = "홍길동";
		정보 info = new 정보();

		info.info(name);
		info.bye();
		
		int result = info.hour();
		System.out.println(result + "시입니다.");
	}

}
