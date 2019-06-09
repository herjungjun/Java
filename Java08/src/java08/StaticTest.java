package java08;

import javax.swing.JOptionPane;

public class StaticTest {

	public static void main(String[] args) {
		String year = JOptionPane.showInputDialog("태어난 해를 입력");
		int y = Integer.parseInt(year);
		System.out.println(2019-y+1);
	}

}
