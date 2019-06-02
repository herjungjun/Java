package 제어문;

import java.util.Date;

public class 시간계산부품사용 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("현재 시각은 " + hour);
		
		int minute = date.getMinutes();
		System.out.println("현재 분은 " + minute);
		
		int second = date.getSeconds();
		System.out.println("현재 초는 " + second);
		
		int year = date.getYear() + 1900;
		System.out.println("올해는 " + year);

		int day = date.getDay();
		System.out.println("요일은 " + day);

		int month = date.getMonth() + 1;
		System.out.println("이번 달은 " + month);

		
	}

}
