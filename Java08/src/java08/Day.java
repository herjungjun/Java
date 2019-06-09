package java08;

public class Day {
//	인스턴스 변수
	String doing;
	int time;
	String location;

//	클래스 변수, 클래스당 한개만 생성
//	객체 생성시 따로 복사되지 않음
//	객체 생성과 상관없는 변수
//	생성된 객체에서 언제든 접근 가능, 공유
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
