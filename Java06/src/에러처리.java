
public class 에러처리 {

	public static void main(String[] args) throws Exception {
		try {
			System.out.println(10/0);			
		} catch (Exception e) {
			System.out.println("에러발생!! 에러발생!!");
		}
		System.out.println("내가 처리 될까요...");
	}

}
