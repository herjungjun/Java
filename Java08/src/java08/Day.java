package java08;

public class Day {
//	�ν��Ͻ� ����
	String doing;
	int time;
	String location;

//	Ŭ���� ����, Ŭ������ �Ѱ��� ����
//	��ü ������ ���� ������� ����
//	��ü ������ ������� ����
//	������ ��ü���� ������ ���� ����, ����
	static int count;
	static int total;

	public Day(String doing, int time, String location) {
		count++;
		total = total + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}

}
