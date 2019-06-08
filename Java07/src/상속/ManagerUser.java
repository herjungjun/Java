package 상속;

public class ManagerUser extends Employee {

	public static void main(String[] args) {
		Manager info = new Manager();
		info.name = "홍길동";
		info.address = "강남구";
		info.salary = 100;
//		info.rrn = 701010;
		
		System.out.println(info);
		info.test();
	}

}
