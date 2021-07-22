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
		System.out.println("*****欢迎来到GJA_POKEMON*****");
		Scanner Scannm = new Scanner(System.in);
		// 输入用户名
		System.out.print("请输入用户名：");
		uname = Scannm.next();
		Scanner scanps = new Scanner(System.in);
		// 输入密码
		System.out.print("请输入密码：");
		pword = scanps.next();
		uname = login(uname, pword);
		if (uname != "") {
			System.out.println("登录成功");
		} else {
			System.out.println("用户名或密码错误");
		}
		return uname;
	}

	public static String login(String uname, String pword) {
		String username = "";
		// 驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		//
		String url = "jdbc:mysql://localhost:3306/test";
		String usename = "root";
		String password = "123456";
		// 获得数据库的连接
		Connection conn = null;
		// 创建预编译
		PreparedStatement ps = null;
		// 查询结果
		ResultSet rs = null;
		// 创建预编译语句
		String sqlquery = "select * from game where game.usename = ? and password = ?";
        
		// 注册驱动
		try {	
			Class.forName(driver);
			// 获得数据库的连接
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
