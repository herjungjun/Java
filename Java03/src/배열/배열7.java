package �迭;

import java.util.Scanner;

public class �迭7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] grade = new int[5];
		int sum = 0;

		for (int i = 0; i < grade.length; i++) {
			System.out.print("�����Է�: ");
			grade[i] = sc.nextInt();
			sum = sum + grade[i];
		}

		System.out.println("��ü�հ�: " + sum);
		double avg = sum / grade.length;

		System.out.println("���: " + avg);

		System.out.println("___________________________________");

	}
}
