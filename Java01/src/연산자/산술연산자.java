package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {

		int x = 5;
		int y = 3;

		System.out.println(x + y);
		
		int z = x + y;
		System.out.println("두 수의 합은 " + z);
		System.out.println(x + " + " + y + " = " + z);
		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + (x / y));
		System.out.println(x + " % " + y + " = " + (x % y));
		
	}

}
