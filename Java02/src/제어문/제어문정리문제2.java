package ���;

import java.util.Scanner;

public class �����������2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�л��� �̸��� �Է�: ");
		String name = sc.next();
		System.out.print("�л��� ������ �Է�: ");
		int grade = sc.nextInt();
		System.out.print(name + "�� ���� ");
		
		if(grade >= 90 ) {
			System.out.print( grade + "���� A����" );
		}
		else if(grade >= 80) {
			System.out.print( grade + "���� B����" );
		}
		else if(grade >= 70) {
			System.out.print( grade + "���� C����" );
		}
		else if(grade >= 60) {
			System.out.print( grade + "���� D����" );
		}
		else {
			System.out.print( grade + "���� F����" );			
		}
			System.out.println("�Դϴ�.");
	}
}
