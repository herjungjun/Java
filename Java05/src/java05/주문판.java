package java05;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 주문판 {
	private static JTextField text;
	static int count;
//	 개수 세는 변수(멤버변수, 자동으로 0)
// 	선언(메모리가 할당)
// 	선언의 위치가 사용할 수 있는 범위
// 	클래스 바로 선언된 변수는
// 	클래서 전체에서 사용 가능(전역변수)

	static int total; // 전체 계산 금액(0 초기화)
	static int[] co = new int[3];
	
	private static JTextField text2;
	private static JTextField text3_1;
	private static JTextField text4_1;
	private static JTextField text5_1;
	private static JTextField text3_2;
	private static JTextField text4_2;
	private static JTextField text5_2;

	public static void main(String[] args) {
		JLabel img = new JLabel("");
		text = new JTextField();
		text2 = new JTextField();
		text3_1 = new JTextField();
		text4_1 = new JTextField();
		text5_1 = new JTextField();
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton b1 = new JButton("\uC9EC\uBF55");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짬뽕.png");
				img.setIcon(icon);
				count++;
				co[0]++;
				text.setText(count + "개");
				total = count * 3000;
				text2.setText(total + "원");
				text3_1.setText(co[0] + "개");
			}
		});
		b1.setBackground(Color.ORANGE);
		b1.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(b1);

		JButton b2 = new JButton("\uC6B0\uB3D9");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("우동.png");
				img.setIcon(icon);
				count++;
				co[1]++;
				text.setText(count + "개");
				total = count * 4000;
				text2.setText(total + "원");
				text4_1.setText(co[1] + "개");
			}
		});
		b2.setBackground(Color.PINK);
		b2.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(b2);

		JButton b3 = new JButton("\uC9DC\uC7A5");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("자장면.png");
				img.setIcon(icon);
				count++;
				co[2]++;
				text.setText(count + "개");
				total = count * 5000;
				text2.setText(total + "원");
				text5_1.setText(co[2] + "개");
			}
		});
		b3.setBackground(Color.CYAN);
		b3.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(b3);

		JLabel label = new JLabel("\uAC1C\uC218");
		label.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(label);

		text.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(text);
		text.setColumns(5);

		img.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uBA54\uC778.png"));
		f.getContentPane().add(img);

		JLabel label_1 = new JLabel("\uC9C0\uBD88\uD560 \uCD1D \uAE08\uC561");
		label_1.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(label_1);

		text2.setForeground(Color.BLUE);
		text2.setFont(new Font("돋움", Font.PLAIN, 50));
		f.getContentPane().add(text2);
		text2.setColumns(7);
		
		JLabel label_2 = new JLabel("\uC9EC\uBF55 \uC8FC\uBB38 \uAC1C\uC218");
		label_2.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(label_2);
		
		text3_1.setFont(new Font("돋움", Font.PLAIN, 50));
		f.getContentPane().add(text3_1);
		text3_1.setColumns(2);
		
		text3_2 = new JTextField();
		text3_2.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(text3_2);
		text3_2.setColumns(5);
		
		JLabel label_3 = new JLabel("\uC9DC\uC7A5 \uC8FC\uBB38 \uAC1C\uC218");
		label_3.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(label_3);
		
		text4_1.setFont(new Font("돋움", Font.PLAIN, 50));
		f.getContentPane().add(text4_1);
		text4_1.setColumns(2);
		
		text4_2 = new JTextField();
		text4_2.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(text4_2);
		text4_2.setColumns(5);
		
		JLabel label_4 = new JLabel("\uC6B0\uB3D9 \uC8FC\uBB38 \uAC1C\uC218");
		label_4.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(label_4);
		
		text5_1.setFont(new Font("돋움", Font.PLAIN, 50));
		f.getContentPane().add(text5_1);
		text5_1.setColumns(2);
		
		text5_2 = new JTextField();
		text5_2.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(text5_2);
		text5_2.setColumns(5);
		f.setTitle("나의 중국집 메뉴판");
		f.setSize(838, 798);
		f.setVisible(true);
	}

}
