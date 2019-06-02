package 연산자;

public class 등급 {

	public static void main(String[] args) {
		int grade = 3;
		
		if(grade == 1 || grade == 3) {
			System.out.println("다른 반으로 가야해요.");
		}
		else {
			if(grade==2) {
				System.out.println("이 반에 있어도 되요.");
			}
			else {
				System.out.println("등급을 다시 입력하세요.");
			}
		}
	}

}
