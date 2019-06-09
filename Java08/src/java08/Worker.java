package java08;

public class Worker {
	String name;
	String gender;
	int age;

	static int ageSum;
	static int count;

	public Worker(String name, String gender, int age) {
		ageSum = ageSum + age;
		count++;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String toString() {
		return "Worker [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	public static void 일하다() {
		System.out.println("일하다.");
	}

	public static void 친화력이있다() {
		System.out.println("친화력이 있다.");
	}

}
