package 제어문;

import java.util.Date;

public class 입력테스트8 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() + 1;

		switch (month) {
		case 2:
			System.out.println("28일까지 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지 입니다.");
			break;
		default:
			System.out.println("31일까지 입니다.");
		}
	}
}
