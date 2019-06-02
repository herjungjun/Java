package 배열;

import java.util.Scanner;

public class 극장예매 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		while (true) {
			System.out.println("-----------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i + 1) + "  ");
			}
			System.out.println();
			// 좌석 예매상황 보여주는 부분
			// 0:예매X, 1:예매O

			System.out.println("-----------------------------");

			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			System.out.println("-----------------------------");
			System.out.print("예매할 좌석 번호(종료:0) ");
			int data = sc.nextInt();
			if (data == 0) {
				System.out.println("예매 시스템을 종료합니다.");
				break;
			}
			if (seat[data - 1] != 0) {
				System.out.println("이미 예매된 자리입니다.");
				System.out.println("다른 자리를 예매해주세요");
			} else {
				seat[data - 1] = 1;
				System.out.println(data + "번의 예매가 완료 되었습니다.");
			}

		}
	}

}
