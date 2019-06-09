package java08;

import java.sql.*;

import javax.swing.JOptionPane;

public class DB연결 {

	public static void main(String[] args) throws Exception {
//		1. 커넥터 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 성공");

//		2. DB 연결(db명, user, pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB 연결 성공");

//		3. SQL문 결정
//		String sql = "insert into member values ('win', 'win', 'win', 'win')";
//		String sql = "insert into member values ('gold', 'gold', 'gold', 'gold')";

		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");

		String sql = "insert into member values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);

		System.out.println("3. SQL문 결정 성공");

//		4. SQL문 전송(실행요청)
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공");

	}

}
