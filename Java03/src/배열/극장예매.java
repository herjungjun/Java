package �迭;

import java.util.Scanner;

public class ���忹�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		while (true) {
			System.out.println("-----------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print((i + 1) + "  ");
			}
			System.out.println();
			// �¼� ���Ż�Ȳ �����ִ� �κ�
			// 0:����X, 1:����O

			System.out.println("-----------------------------");

			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			System.out.println("-----------------------------");
			System.out.print("������ �¼� ��ȣ(����:0) ");
			int data = sc.nextInt();
			if (data == 0) {
				System.out.println("���� �ý����� �����մϴ�.");
				break;
			}
			if (seat[data - 1] != 0) {
				System.out.println("�̹� ���ŵ� �ڸ��Դϴ�.");
				System.out.println("�ٸ� �ڸ��� �������ּ���");
			} else {
				seat[data - 1] = 1;
				System.out.println(data + "���� ���Ű� �Ϸ� �Ǿ����ϴ�.");
			}

		}
	}

}
