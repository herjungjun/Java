package ���;

import java.util.Scanner;

public class �����������3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 : ");
		int n1 = sc.nextInt();

		System.out.print("���� 2 : ");
		int n2 = sc.nextInt();

		System.out.print("������ : ");
		String symbol = sc.next();
		char s = symbol.charAt(0);

		System.out.println("----------------------------");
		switch (s) {
		case '+':
			System.out.println("��� ����� " + n1 + s + n2 + " = " + (n1 + n2)); 
			break;
		case '-':
			System.out.println("��� ����� " + n1 + s + n2 + " = " + (n1 - n2)); 
			break;
		case '*':
			System.out.println("��� ����� " + n1 + s + n2 + " = " + (n1 * n2)); 
			break;
		case '/':
			System.out.println("��� ����� " + n1 + s + n2 + " = " + (n1 / n2)); 
			break;
		default:
			System.out.println("����� �� �����.");
		}

	}
}
