package 제어문;

import java.util.Scanner;

public class 제어문정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 과목은?(파이썬, 자바, C++)");
	
		int subject = sc.nextInt();
		
		switch(subject) {
		case 1:
			System.out.println("파이썬은 쉽고 강해요.");
			break;
		case 2:
			System.out.println("자바는 실무에서 쓰여요.");
			break;
		case 3: 
			System.out.println("C++은 정교해요.");
		}
	}
}
