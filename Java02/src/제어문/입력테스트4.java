package 제어문;

import java.util.Scanner;

public class 입력테스트4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("지금 시각은 ");
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
