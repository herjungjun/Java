package java05;

public class 계산기2 {
	// 동적특징 - 더하다, 빼다
	public void 더하다(int x, int y) {	
		System.out.println(x + y);
	}
	public void 빼다(int x, int y) {
		System.out.println(x - y);
	}
	public int 곱하다(int price, int count) {
		int total = price * count;
		return total;
	}
	public int 나누다(int n1, int n2) { 
		int n3 = n1 / n2;
		return n3; 
	}
}
