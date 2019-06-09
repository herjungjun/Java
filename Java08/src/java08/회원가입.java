package java08;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class ȸ������ extends JFrame {
	private JTextField id;
	private JTextField pw;
	private JTextField name;
	private JTextField tel;

	public ȸ������() {
		getContentPane().setBackground(Color.GREEN);
		setTitle("ȸ������");
		setSize(460, 584);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("\uC544\uC774\uB514");
		label.setFont(new Font("����", Font.PLAIN, 40));
		getContentPane().add(label);
		
		id = new JTextField();
		id.setBackground(Color.YELLOW);
		id.setFont(new Font("����", Font.PLAIN, 40));
		getContentPane().add(id);
		id.setColumns(10);
		
		JLabel label_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		label_1.setFont(new Font("����", Font.PLAIN, 40));
		getContentPane().add(label_1);
		
		pw = new JTextField();
		pw.setBackground(Color.YELLOW);
		pw.setFont(new Font("����", Font.PLAIN, 40));
		pw.setColumns(10);
		getContentPane().add(pw);
		
		JLabel label_2 = new JLabel("\uC774 \uB984");
		label_2.setFont(new Font("����", Font.PLAIN, 40));
		getContentPane().add(label_2);
		
		name = new JTextField();
		name.setBackground(Color.YELLOW);
		name.setFont(new Font("����", Font.PLAIN, 40));
		name.setColumns(10);
		getContentPane().add(name);
		
		JLabel label_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_3.setFont(new Font("����", Font.PLAIN, 40));
		getContentPane().add(label_3);
		
		tel = new JTextField();
		tel.setBackground(Color.YELLOW);
		tel.setFont(new Font("����", Font.PLAIN, 40));
		tel.setColumns(10);
		getContentPane().add(tel);
		
		JButton b = new JButton("\uD68C\uC6D0\uAC00\uC785");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				try {
				//				1. Ŀ���� ����
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. Ŀ���� ���� ����");

//				2. DB ����(db��, user, pw)
				String url = "jdbc:mysql://localhost:3306/bigdata";
				String user = "root";
				String password = "1234";

				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2. DB ���� ����");

//				3. SQL�� ����

				String gid = id.getText();
				String gpw = pw.getText();
				String gname = name.getText();
				String gtel = tel.getText();

				String sql = "insert into member values (?, ?, ?, ?)";
				PreparedStatement ps = con.prepareStatement(sql);

				ps.setString(1, gid);
				ps.setString(2, gpw);
				ps.setString(3, gname);
				ps.setString(4, gtel);

				System.out.println("3. SQL�� ���� ����");

//				4. SQL�� ����(�����û)
				ps.executeUpdate();
				System.out.println("4. SQL�� ���� ����");
				
				id.setText("");
				pw.setText("");
				name.setText("");
				tel.setText("");
				
				} catch (Exception e) {
					System.out.println("����!");
				}
			}
		});
		b.setForeground(Color.WHITE);
		b.setFont(new Font("����", Font.PLAIN, 40));
		b.setBackground(Color.RED);
		getContentPane().add(b);
		setVisible(true);
		
		JButton b2 = new JButton();
		
		
		
	}
	public static void main(String[] args) {
		ȸ������ name = new ȸ������();
	}

}
