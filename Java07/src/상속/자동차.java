package ���;

public class �ڵ��� extends Object {
//	��, �̸�
	String color;
	String name;

	public �ڵ���() {
	}

	public �ڵ���(String color, String name) {
		this.color = color;
		this.name = name;
	}

//	����ϴ�, ���ߴ�
	public void start() {
		System.out.println("����ϴ�.");
	}

	public void stop() {
		System.out.println("���ߴ�");
	}

	@Override
	public String toString() {
		return "�ڵ��� [color=" + color + ", name=" + name + "]";
	}
	
}
