package java05;

public class ����2 {

	public static void main(String[] args) {
		����2 cal = new ����2();
		int sum = cal.���ϴ�(3000, 5);
		System.out.println(sum);

		if (sum >= 10000) {
			System.out.println(sum - 3000);
		} else {
			System.out.println(sum);
		}

		System.out.println(cal.������(33, 2));
		
		int result = cal.������(33, 2);
		System.out.println(result);
		
		if (result >= 20) {
			System.out.println("�������� �ʹ� Ŀ��.");
		} else {
			System.out.println("�������� �۾ƿ�.");
		}

	}

}
