package ¹è¿­;

import java.util.Scanner;

public class Int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i : num) {
			System.out.print(i + "  ");
		}
	}

}
