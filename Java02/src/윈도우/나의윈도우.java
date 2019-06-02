package 윈도우;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class 나의윈도우 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setBackground(Color.DARK_GRAY);
		f.setSize(300, 300);
		f.setTitle("나의 윈도우 프로그램");
		
		JButton btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("HY견고딕", Font.PLAIN, 14));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton button = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(button, BorderLayout.NORTH);
		
		JButton button_1 = new JButton("\uC548\uB155\uD558\uC138\uC694");
		button_1.setFont(new Font("HY엽서L", Font.PLAIN, 16));
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.BLACK);
		f.getContentPane().add(button_1, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
