package 상속;

public class Manager extends Employee {
	int bonus;
	
	public void test() {
		System.out.println("관리 감독하다.");
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", address=" 
	+ address + ", salary=" + salary + ", rrn="	+ rrn + "]";
	}
	
}
