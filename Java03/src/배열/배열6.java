package �迭;

import java.util.Scanner;

public class �迭6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		
		for(int i = 0; i < names.length ; i++ ) {
			System.out.print(i + ": �̸�: ");
			names[i] = sc.next();
		}
		for(String s : names) {
			System.out.println(s);
		}
	}

}
