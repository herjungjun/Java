package 제어문;

import java.util.Scanner;

public class 입력테스트6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 음식을 입력하세요.(분식, 한식, 일식, 집)");
		String food = sc.next();
		switch (food) {
		case "분식":
			System.out.println("분식집으로 가요.");
			break;
		case "한식":
			System.out.println("한식집으로 가요.");
			break;
		case "일식":
			System.out.println("일식집으로 가요.");
			break;
		case "집":
			System.out.println("집밥을 먹어요.");
			break;
		default:
			System.out.println("식사를 안하실 건가요??");
		}
	}

}
