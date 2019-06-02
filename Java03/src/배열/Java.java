package 배열;

import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = new String[3];

		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
		System.out.println("***" + s[0] + "보다는" + s[1] + "***");
	}

}
