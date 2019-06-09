package java08;

import java.sql.*;

import javax.swing.JOptionPane;

public class DB���� {

	public static void main(String[] args) throws Exception {
//		1. Ŀ���� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ���� ����");

//		2. DB ����(db��, user, pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB ���� ����");

//		3. SQL�� ����
//		String sql = "insert into member values ('win', 'win', 'win', 'win')";
//		String sql = "insert into member values ('gold', 'gold', 'gold', 'gold')";

		String id = JOptionPane.showInputDialog("���̵� �Է�");
		String pw = JOptionPane.showInputDialog("�н����� �Է�");
		String name = JOptionPane.showInputDialog("�̸� �Է�");
		String tel = JOptionPane.showInputDialog("��ȭ��ȣ �Է�");

		String sql = "insert into member values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);

		System.out.println("3. SQL�� ���� ����");

//		4. SQL�� ����(�����û)
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����");

	}

}
