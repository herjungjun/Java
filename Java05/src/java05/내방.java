package java05;

public class ���� {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.ch = 100;
		tv1.color = "������";
		tv1.onOff = true;
		tv1.ä�ιٲٴ�();
		tv1.�����������ϴ�();
		System.out.println("------------------------");
		
		Tv tv2 = new Tv();
		tv2.ch = 50;
		tv2.color = "�Ͼ��";
		tv2.onOff = true;
		tv1.ä�ιٲٴ�();
		tv2.�����������ϴ�();
		System.out.println(tv2.ch);
		System.out.println(tv2.color);
		System.out.println(tv2.onOff);
		System.out.println("------------------------");
		
		�޴��� phone1 = new �޴���();
		phone1.shape = "�׸�";
		phone1.size = 11;
		System.out.println(phone1.shape);
		System.out.println(phone1.size);		
		phone1.post();
		phone1.tel();
		System.out.println("------------------------");
		
		�޴��� phone2 = new �޴���();
		phone2.shape = "���׶��";
		phone2.size = 15;
		phone2.game();
		System.out.println("------------------------");
		
		Person me = new Person();
		me.name = "ȫ�浿";
		me.age = 15;
		me.���ڴ�();
		System.out.println(me.name);
		System.out.println(me);
		System.out.println("------------------------");
		
		Person dad = new Person();
		dad.name = "ȫ�ν�";
		dad.age = 50;
		
	}

}
