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

public class 회원가입 extends JFrame {
	private JTextField id;
	private JTextField pw;
	private JTextField name;
	private JTextField tel;

	public 회원가입() {
		getContentPane().setBackground(Color.GREEN);
		setTitle("회원가입");
		setSize(460, 584);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("\uC544\uC774\uB514");
		label.setFont(new Font("굴림", Font.PLAIN, 40));
		getContentPane().add(label);
		
		id = new JTextField();
		id.setBackground(Color.YELLOW);
		id.setFont(new Font("굴림", Font.PLAIN, 40));
		getContentPane().add(id);
		id.setColumns(10);
		
		JLabel label_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC");
		label_1.setFont(new Font("굴림", Font.PLAIN, 40));
		getContentPane().add(label_1);
		
		pw = new JTextField();
		pw.setBackground(Color.YELLOW);
		pw.setFont(new Font("굴림", Font.PLAIN, 40));
		pw.setColumns(10);
		getContentPane().add(pw);
		
		JLabel label_2 = new JLabel("\uC774 \uB984");
		label_2.setFont(new Font("굴림", Font.PLAIN, 40));
		getContentPane().add(label_2);
		
		name = new JTextField();
		name.setBackground(Color.YELLOW);
		name.setFont(new Font("굴림", Font.PLAIN, 40));
		name.setColumns(10);
		getContentPane().add(name);
		
		JLabel label_3 = new JLabel("\uC804\uD654\uBC88\uD638");
		label_3.setFont(new Font("굴림", Font.PLAIN, 40));
		getContentPane().add(label_3);
		
		tel = new JTextField();
		tel.setBackground(Color.YELLOW);
		tel.setFont(new Font("굴림", Font.PLAIN, 40));
		tel.setColumns(10);
		getContentPane().add(tel);
		
		JButton b = new JButton("\uD68C\uC6D0\uAC00\uC785");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				try {
				//				1. 커넥터 설정
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. 커넥터 설정 성공");

//				2. DB 연결(db명, user, pw)
				String url = "jdbc:mysql://localhost:3306/bigdata";
				String user = "root";
				String password = "1234";

				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("2. DB 연결 성공");

//				3. SQL문 결정

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

				System.out.println("3. SQL문 결정 성공");

//				4. SQL문 전송(실행요청)
				ps.executeUpdate();
				System.out.println("4. SQL문 전송 성공");
				
				id.setText("");
				pw.setText("");
				name.setText("");
				tel.setText("");
				
				} catch (Exception e) {
					System.out.println("실패!");
				}
			}
		});
		b.setForeground(Color.WHITE);
		b.setFont(new Font("굴림", Font.PLAIN, 40));
		b.setBackground(Color.RED);
		getContentPane().add(b);
		setVisible(true);
		
		JButton b2 = new JButton();
		
		
		
	}
	public static void main(String[] args) {
		회원가입 name = new 회원가입();
	}

}
