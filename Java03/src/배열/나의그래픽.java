package 배열;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.YELLOW);
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setFont(new Font("굴림", Font.ITALIC, 10));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setForeground(Color.ORANGE);
		btnNewButton_2.setBackground(Color.BLUE);
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBackground(Color.WHITE);
		f.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setBackground(Color.PINK);
		f.getContentPane().add(btnNewButton_4, BorderLayout.EAST);
		f.setVisible(true);
	}

}
