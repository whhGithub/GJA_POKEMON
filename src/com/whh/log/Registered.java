package com.whh.log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.whh.character.Hp;
import com.whh.inital.Initial;
public class Registered {
	// 注册页面
		public static void registered() {
			String uesname = null;
			String password = null;
			System.out.println("******GJA_POKEMON——REFISTERED******");
			Scanner scanname = new Scanner(System.in);
			System.out.print("请您注册用户名：");
			uesname = scanname.next();
			Scanner scanpword = new Scanner(System.in);
			System.out.print("请输入注册密码：");
			password = scanpword.next();
			// 创建用户名
			login1(uesname, password);
		}

		public static void login1(String uesname, String password) {
			String sqlAdd = "INSERT INTO game(usename,password)value(?,?)";
			String sqlUpdate = "update game t set t.password(?) where t.id(?) ";
			// 注册驱动
			String driver = "com.mysql.jdbc.Driver";
			// 链接我们的数据库
			String url = "jdbc:mysql://localhost:3306/test";
			String uname = "root";
			String pword = "123456";

			// 加载驱动
			Connection conn = null;// 为了美观在着里引用驱动里面的Connection类的方法getConnection();
			PreparedStatement ps = null;// 预编译
			try {
				Class.forName(driver);
				// 获得数据库的链接
				conn = DriverManager.getConnection(url, uname, pword);
				// 用预编译来控制驱动完成sql命令
				ps = conn.prepareStatement(sqlAdd);// 三部曲结束
				// 将参数放进暂定符？？内 set设置
				ps.setString(1, uesname);
				ps.setString(2, password);
				// 增删改 execute执行 Update更新
				int count = ps.executeUpdate();
				System.out.println("注册成功，欢迎使用");
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
