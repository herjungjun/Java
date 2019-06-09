package java08;

public class WorkerTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Worker wk1 = new Worker("임아무개", "남", 24);
		Worker w2 = new Worker("김아무개", "여", 23);
		Worker wl3 = new Worker("박아무개", "남", 25);

		System.out.println("전체 직원수는: " + Worker.count);
		System.out.println("첫 번째 직원의 이름은: " + wk1.name);
		System.out.println("직원들 나이의 합은: " + Worker.ageSum);
		System.out.println("직원들의 평균 나이는: " + (Worker.ageSum / Worker.count));

		Worker.일하다();
		Worker.친화력이있다();

	}

}
