package java05;

public class 내방 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.ch = 100;
		tv1.color = "검정색";
		tv1.onOff = true;
		tv1.채널바꾸다();
		tv1.볼륨을조절하다();
		System.out.println("------------------------");
		
		Tv tv2 = new Tv();
		tv2.ch = 50;
		tv2.color = "하얀색";
		tv2.onOff = true;
		tv1.채널바꾸다();
		tv2.볼륨을조절하다();
		System.out.println(tv2.ch);
		System.out.println(tv2.color);
		System.out.println(tv2.onOff);
		System.out.println("------------------------");
		
		휴대폰 phone1 = new 휴대폰();
		phone1.shape = "네모";
		phone1.size = 11;
		System.out.println(phone1.shape);
		System.out.println(phone1.size);		
		phone1.post();
		phone1.tel();
		System.out.println("------------------------");
		
		휴대폰 phone2 = new 휴대폰();
		phone2.shape = "동그라미";
		phone2.size = 15;
		phone2.game();
		System.out.println("------------------------");
		
		Person me = new Person();
		me.name = "홍길동";
		me.age = 15;
		me.잠자다();
		System.out.println(me.name);
		System.out.println(me);
		System.out.println("------------------------");
		
		Person dad = new Person();
		dad.name = "홍두식";
		dad.age = 50;
		
	}

}
