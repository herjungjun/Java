package ���;

import java.util.Date;

public class �ð�����ǰ��� {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("���� �ð��� " + hour);
		
		int minute = date.getMinutes();
		System.out.println("���� ���� " + minute);
		
		int second = date.getSeconds();
		System.out.println("���� �ʴ� " + second);
		
		int year = date.getYear() + 1900;
		System.out.println("���ش� " + year);

		int day = date.getDay();
		System.out.println("������ " + day);

		int month = date.getMonth() + 1;
		System.out.println("�̹� ���� " + month);

		
	}

}
