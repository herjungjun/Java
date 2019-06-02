package 제어문;

import java.util.Scanner;

public class 입력테스트2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는 ");
		int age = sc.nextInt();
		System.out.println("당신의 나이는 " + age + "세 시군요.");
		
		System.out.print("당신의 이름은  ");
		String name = sc.next();
		System.out.println("당신의 이름은 " + name + "이시군요.");
		
		
	}

}
