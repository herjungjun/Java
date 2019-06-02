package 배열;

import java.util.Scanner;

public class 배열7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] grade = new int[5];
		int sum = 0;

		for (int i = 0; i < grade.length; i++) {
			System.out.print("성적입력: ");
			grade[i] = sc.nextInt();
			sum = sum + grade[i];
		}

		System.out.println("전체합계: " + sum);
		double avg = sum / grade.length;

		System.out.println("평균: " + avg);

		System.out.println("___________________________________");

	}
}
