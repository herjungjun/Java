package 제어문;

import java.util.Scanner;

public class 제어문정리문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		int n1 = sc.nextInt();

		System.out.print("숫자 2 : ");
		int n2 = sc.nextInt();

		System.out.print("연산자 : ");
		String symbol = sc.next();
		char s = symbol.charAt(0);

		System.out.println("----------------------------");
		switch (s) {
		case '+':
			System.out.println("계산 결과는 " + n1 + s + n2 + " = " + (n1 + n2)); 
			break;
		case '-':
			System.out.println("계산 결과는 " + n1 + s + n2 + " = " + (n1 - n2)); 
			break;
		case '*':
			System.out.println("계산 결과는 " + n1 + s + n2 + " = " + (n1 * n2)); 
			break;
		case '/':
			System.out.println("계산 결과는 " + n1 + s + n2 + " = " + (n1 / n2)); 
			break;
		default:
			System.out.println("계산할 수 없어요.");
		}

	}
}
