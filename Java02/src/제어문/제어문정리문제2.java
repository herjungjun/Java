package 제어문;

import java.util.Scanner;

public class 제어문정리문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력: ");
		String name = sc.next();
		System.out.print("학생의 점수를 입력: ");
		int grade = sc.nextInt();
		System.out.print(name + "의 점수 ");
		
		if(grade >= 90 ) {
			System.out.print( grade + "점은 A학점" );
		}
		else if(grade >= 80) {
			System.out.print( grade + "점은 B학점" );
		}
		else if(grade >= 70) {
			System.out.print( grade + "점은 C학점" );
		}
		else if(grade >= 60) {
			System.out.print( grade + "점은 D학점" );
		}
		else {
			System.out.print( grade + "점은 F학점" );			
		}
			System.out.println("입니다.");
	}
}
