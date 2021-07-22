package com.whh.log;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import com.whh.playGame.Game1;
public class Login {
	public static String dl1() {
		// TODO Auto-generated method stu
		String uname;
		String pword;
		System.out.println("*****��ӭ����GJA_POKEMON*****");
		Scanner Scannm = new Scanner(System.in);
		// �����û���
		System.out.print("�������û�����");
		uname = Scannm.next();
		Scanner scanps = new Scanner(System.in);
		// ��������
		System.out.print("���������룺");
		pword = scanps.next();
		uname = login(uname, pword);
		if (uname != "") {
			System.out.println("��¼�ɹ�");
		} else {
			System.out.println("�û������������");
		}
		return uname;
	}

	public static String login(String uname, String pword) {
		String username = "";
		// ����������
		String driver = "com.mysql.jdbc.Driver";
		//
		String url = "jdbc:mysql://localhost:3306/test";
		String usename = "root";
		String password = "123456";
		// ������ݿ������
		Connection conn = null;
		// ����Ԥ����
		PreparedStatement ps = null;
		// ��ѯ���
		ResultSet rs = null;
		// ����Ԥ�������
		String sqlquery = "select * from game where game.usename = ? and password = ?";
        
		// ע������
		try {	
			Class.forName(driver);
			// ������ݿ������
			conn = DriverManager.getConnection(url, usename, password);
			ps = conn.prepareStatement(sqlquery);
			ps.setString(1, uname);
			ps.setString(2, pword);
			rs = ps.executeQuery();
			rs.next();
			username = rs.getString(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
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

		return username;

	}

}
