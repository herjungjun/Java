package java06;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class È¸¿ø°¡ÀÔ {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uC81C\uBAA9 \uC5C6\uC74C1.png"));
		f.getContentPane().add(img);
		
		JLabel id = new JLabel("\uC544\uC774\uB514");
		id.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
		f.getContentPane().add(id);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLACK);
		t1.setBackground(SystemColor.inactiveCaptionBorder);
		t1.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		f.getContentPane().add(t1);
		t1.setColumns(15);
		
		JLabel pw = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pw.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
		f.getContentPane().add(pw);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLACK);
		t2.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		t2.setColumns(15);
		t2.setBackground(SystemColor.inactiveCaptionBorder);
		f.getContentPane().add(t2);
		
		JLabel name = new JLabel("\uC774\uB984");
		name.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
		f.getContentPane().add(name);
		
		t3 = new JTextField();
		t3.setForeground(Color.BLACK);
		t3.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		t3.setColumns(15);
		t3.setBackground(SystemColor.inactiveCaptionBorder);
		f.getContentPane().add(t3);
		
		JLabel tel = new JLabel("\uC804\uD654\uBC88\uD638");
		tel.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
		f.getContentPane().add(tel);
		
		t4 = new JTextField();
		t4.setForeground(Color.BLACK);
		t4.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		t4.setColumns(15);
		t4.setBackground(SystemColor.inactiveCaptionBorder);
		f.getContentPane().add(t4);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				try {
					FileWriter file = new FileWriter(id + ".txt");
					file.write(id + "\r\n");
					file.write(pw + "\r\n");
					file.write(name + "\r\n");
					file.write(tel + "\r\n");
					file.close();
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		button.setBackground(SystemColor.inactiveCaptionBorder);
		button.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\\uC81C\uBAA9 \uC5C6\uC74C3.png"));
		button.setHorizontalAlignment(SwingConstants.LEFT);
		f.getContentPane().add(button);
		f.setSize(449, 497);
		f.setVisible(true);
	}

}
