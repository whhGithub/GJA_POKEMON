package com.whh.log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.whh.character.Elves;
import com.whh.character.Hp;

public class Sava {
	public static void sava(String a, Hp hp1, Elves elves) {
		String elve1 = elves.getName();
		String elve2 = hp1.getElve2();
		String elve3 = hp1.getElve3();
		int badge = hp1.getBadge();
		int eifBall = hp1.getEifBall();
		sava1(a, elve1, elve2, elve3,badge,eifBall);
	}

	public static void sava1(String uername, String elve1, String elve2, String elve3, int badge, int eifBall) {
		String sqlAdd = "INSERT INTO game(usename,password,elve1,elve2,elve3,le,badge,eifball)value(?,?,?,?,?,?,?,?)";
		String sqlUpdate = "update game t set t.elve1 = ?, t.elve2=?,t.elve3=?, t.badge=?,t.eifBall=? where t.usename =?";
		// ע������
		String driver = "com.mysql.jdbc.Driver";
		// �������ǵ����ݿ�
		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String pword = "123456";
		System.out.println("1");
		// ��������
		Connection conn = null;// Ϊ�������������������������Connection��ķ���getConnection();
		PreparedStatement ps = null;// Ԥ����
		try {
			//ע������
			Class.forName(driver);
			// ������ݿ������
			conn = DriverManager.getConnection(url, uname, pword);
			// ��Ԥ�����������������sql����
			ps = conn.prepareStatement(sqlUpdate);// ����������
			// �������Ž��ݶ��������� set����
			ps.setString(1, elve1);
			ps.setString(2, elve2);
			ps.setString(3, elve3);
			ps.setInt(4, badge);
			ps.setInt(5, eifBall);
			ps.setString(6, uername);	
			// ��ɾ�� executeִ�� Update����
			int count = ps.executeUpdate();
			System.out.println("���³ɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
