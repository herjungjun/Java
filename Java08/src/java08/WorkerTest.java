package java08;

public class WorkerTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Worker wk1 = new Worker("�Ӿƹ���", "��", 24);
		Worker w2 = new Worker("��ƹ���", "��", 23);
		Worker wl3 = new Worker("�ھƹ���", "��", 25);

		System.out.println("��ü ��������: " + Worker.count);
		System.out.println("ù ��° ������ �̸���: " + wk1.name);
		System.out.println("������ ������ ����: " + Worker.ageSum);
		System.out.println("�������� ��� ���̴�: " + (Worker.ageSum / Worker.count));

		Worker.���ϴ�();
		Worker.ģȭ�����ִ�();

	}

}
