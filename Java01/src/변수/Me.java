package 변수;

public class Me {

	public static void main(String[] args) {
		int age = 100;
		byte count = 127; //-128 ~ 127
		short count2 = 30000; //-30000 ~ 30000
		int last = age - 1;
		long count3 = 2398401928312l;
		
		float eye2 = 0.9f;
		double eye = 0.15;
		char gender = '남';
		boolean food = false; //true
		String name = "허정준";
		
		System.out.println("내 이름은 " + name);
		System.out.println("내 나이는 " + age + "세 입니다.");
		System.out.println("작년 나이는 " + last + "세 였습니다.");
		System.out.println("내 시력은 " + eye );
		System.out.println("내 성별은 " + gender);
		System.out.println("아침을 먹었나요? " + food);
		
	}

}
