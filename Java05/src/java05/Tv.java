package java05;

public class Tv {
//	정적 - 색, 켜져있는지 싱태, 채널 → 멤버변수
	String color;
	boolean onOff;
	int ch;
//	동적 - 채널을 바꾸다, 볼륨을 조절하다. → 멤버메소드
	public void 채널바꾸다() {
		System.out.println("채널을 바꾸다.");
	}
	public void 볼륨을조절하다() {
		System.out.println("볼륨을 조절하다.");
	}
	
		


}
