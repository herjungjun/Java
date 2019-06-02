package java05;

public class 가게2 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();
		int sum = cal.곱하다(3000, 5);
		System.out.println(sum);

		if (sum >= 10000) {
			System.out.println(sum - 3000);
		} else {
			System.out.println(sum);
		}

		System.out.println(cal.나누다(33, 2));
		
		int result = cal.나누다(33, 2);
		System.out.println(result);
		
		if (result >= 20) {
			System.out.println("나눈수가 너무 커요.");
		} else {
			System.out.println("나눈수가 작아요.");
		}

	}

}
