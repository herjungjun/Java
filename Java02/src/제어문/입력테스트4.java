package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ð��� ");
		int time = sc.nextInt();
		if(time <= 10) {
			System.out.println("Good Morning!");
		}
		else if(time <= 14) {
			System.out.println("Good Afternoon!");
		}
		else if(time <= 20 ) {
			System.out.println("Good Evening!");
		}
		else {
			System.out.println("Good Night!");
		}
	}

}
