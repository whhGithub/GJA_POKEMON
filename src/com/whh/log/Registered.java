package com.whh.log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.whh.character.Hp;
import com.whh.inital.Initial;
public class Registered {
	// ע��ҳ��
		public static void registered() {
			String uesname = null;
			String password = null;
			System.out.println("******GJA_POKEMON����REFISTERED******");
			Scanner scanname = new Scanner(System.in);
			System.out.print("����ע���û�����");
			uesname = scanname.next();
			Scanner scanpword = new Scanner(System.in);
			System.out.print("������ע�����룺");
			password = scanpword.next();
			// �����û���
			login1(uesname, password);
		}

		public static void login1(String uesname, String password) {
			String sqlAdd = "INSERT INTO game(usename,password)value(?,?)";
			String sqlUpdate = "update game t set t.password(?) where t.id(?) ";
			// ע������
			String driver = "com.mysql.jdbc.Driver";
			// �������ǵ����ݿ�
			String url = "jdbc:mysql://localhost:3306/test";
			String uname = "root";
			String pword = "123456";

			// ��������
			Connection conn = null;// Ϊ�������������������������Connection��ķ���getConnection();
			PreparedStatement ps = null;// Ԥ����
			try {
				Class.forName(driver);
				// ������ݿ������
				conn = DriverManager.getConnection(url, uname, pword);
				// ��Ԥ�����������������sql����
				ps = conn.prepareStatement(sqlAdd);// ����������
				// �������Ž��ݶ��������� set����
				ps.setString(1, uesname);
				ps.setString(2, password);
				// ��ɾ�� executeִ�� Update����
				int count = ps.executeUpdate();
				System.out.println("ע��ɹ�����ӭʹ��");
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
