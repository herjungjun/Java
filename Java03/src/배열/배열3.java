package 배열;

public class 배열3 {

	public static void main(String[] args) {
//		int ages[] = {100, 40, 20, 30};

		int[] ages = { 100, 40, 20, 30 };
		System.out.println(ages.length);

		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		System.out.println(ages[3]);

		System.out.println("-----------------------");

		for (int i = 0; i < ages.length; i++) {
			System.out.println(i + ": " + ages[i]);
		}

		// for-each문
		for (int i : ages) {
			System.out.println(i);
		}

	}
}
