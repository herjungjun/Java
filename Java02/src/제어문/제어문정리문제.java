package ���;

import java.util.Scanner;

public class ����������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϴ� ������?(���̽�, �ڹ�, C++)");
	
		int subject = sc.nextInt();
		
		switch(subject) {
		case 1:
			System.out.println("���̽��� ���� ���ؿ�.");
			break;
		case 2:
			System.out.println("�ڹٴ� �ǹ����� ������.");
			break;
		case 3: 
			System.out.println("C++�� �����ؿ�.");
		}
	}
}
