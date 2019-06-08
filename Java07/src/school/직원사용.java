package school;

import company.직원;

public class 직원사용 {

	public static void main(String[] args) {
		직원 emp = new 직원();
//		emp.rrn = 12;
//		emp.address = "구로구"; 
//	 	default는 다른  패키지에서 접근 불가능

		emp.name = "홍길동"; // public
//		emp.salary = 100; // protected
//		protected는 다른 패키지인 경우 상속
	}

}
