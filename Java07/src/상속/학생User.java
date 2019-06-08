package 상속;

public class 학생User {

	public static void main(String[] args) {
		초등학생 element = new 초등학생();
		중학생 middle = new 중학생();
		고등학생 high = new 고등학생();
		
		element.jumpingrope();
		middle.english();
		high.admission();
	}

}
