
package java06;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class �Խ��� {
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	 public �Խ���() {
		 JFrame f = new JFrame("���� �Խ���");
		 f.getContentPane().setBackground(Color.YELLOW);
		 f.getContentPane().setFont(new Font("����", Font.PLAIN, 30));
		 f.setSize(323, 628);
		 f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		 
		 JLabel label_4 = new JLabel("");
		 label_4.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\c.png"));
		 f.getContentPane().add(label_4);
		 
		 JLabel label = new JLabel("\uB0A0\uC9DC");
		 label.setFont(new Font("����", Font.PLAIN, 30));
		 f.getContentPane().add(label);
		 
		 t1 = new JTextField();
		 t1.setForeground(Color.BLUE);
		 t1.setFont(new Font("����", Font.PLAIN, 30));
		 f.getContentPane().add(t1);
		 t1.setColumns(10);
		 
		 JLabel label_2 = new JLabel("\uC81C\uBAA9");
		 label_2.setFont(new Font("����", Font.PLAIN, 30));
		 f.getContentPane().add(label_2);
		 
		 t2 = new JTextField();
		 t2.setForeground(Color.BLUE);
		 t2.setFont(new Font("����", Font.PLAIN, 30));
		 t2.setColumns(10);
		 f.getContentPane().add(t2);
		 
		 JLabel label_1 = new JLabel("\uB0B4\uC6A9");
		 label_1.setFont(new Font("����", Font.PLAIN, 30));
		 f.getContentPane().add(label_1);
		 
		 t3 = new JTextField();
		 t3.setForeground(Color.BLUE);
		 t3.setFont(new Font("����", Font.PLAIN, 30));
		 t3.setColumns(10);
		 f.getContentPane().add(t3);
		 
		 JLabel label_3 = new JLabel("\uAE00\uC4F4\uC774");
		 label_3.setFont(new Font("����", Font.PLAIN, 30));
		 f.getContentPane().add(label_3);
		 
		 t4 = new JTextField();
		 t4.setForeground(Color.BLUE);
		 t4.setFont(new Font("����", Font.PLAIN, 30));
		 t4.setColumns(9);
		 f.getContentPane().add(t4);
		 
		 JButton button = new JButton("\uAE00\uC62C\uB9AC\uAE30");
		 button.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		String day = t1.getText();
		 		String ���� = t2.getText();
		 		String ���� = t3.getText();
		 		String �۾��� = t4.getText();
		 		
		 		try {
					FileWriter file = new FileWriter(day + ".txt");
					file.write(day + "\r\n");
					file.write(���� + "\r\n");
					file.write(���� + "\r\n");
					file.write(�۾��� + "\r\n");
					file.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
		 		
		 		System.out.println(day);
		 		System.out.println(����);
		 		System.out.println(����);
		 		System.out.println(�۾���);
		 		
		 		
		 		
		 		
		 	}
		 });
		 button.setFont(new Font("����", Font.PLAIN, 40));
		 button.setBackground(Color.GREEN);
		 button.setForeground(Color.RED);
		 f.getContentPane().add(button);
		 f.setVisible(true);
	 }
	
	public static void main(String[] args) {
		�Խ��� bbs = new �Խ���();
	}

}
