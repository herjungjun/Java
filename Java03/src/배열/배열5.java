package 배열;

public class 배열5 {

	public static void main(String[] args) {
		int[] ages = new int[5];
		System.out.println(ages[0]);
		System.out.println(ages);
		System.out.println("-------------");

		for (int i = 0; i < ages.length; i++) {
			ages[i] = i + 1;
		}
		for (int i : ages) {
			System.out.print(i + " ");
		}
	}

}
