package 배열;

public class 배열1 {

	public static void main(String[] args) {
		int[] ages = { 100, 50, 30, 15, 23 };

		// 배열명[위치값(index)]
		System.out.println(ages[0]);
		System.out.println(ages[4]);

		// 배열명[index] = 값;
		ages[0] = 200;
		System.out.println(ages[0]);

	}

}
