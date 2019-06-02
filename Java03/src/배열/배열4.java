package 배열;

public class 배열4 {

	public static void main(String[] args) {
		String[] movies = { "M1", "M2", "M3", "M4", "M5" };
		int[] rate = { 9, 8, 9, 9, 9 };
		char[] grade = { 'A', 'B', 'A', 'A', 'A' };

		for (String s : movies) {
			System.out.println(s);
		}

		for (int i = 0; i < rate.length; i++) {
			System.out.println(i + ": " + rate[i]);
		}

		for (char c : grade) {
			System.out.println(c);
		}

	}

}
