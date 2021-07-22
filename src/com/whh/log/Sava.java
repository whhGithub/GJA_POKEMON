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
		// 注册驱动
		String driver = "com.mysql.jdbc.Driver";
		// 链接我们的数据库
		String url = "jdbc:mysql://localhost:3306/test";
		String uname = "root";
		String pword = "123456";
		System.out.println("1");
		// 加载驱动
		Connection conn = null;// 为了美观在着里引用驱动里面的Connection类的方法getConnection();
		PreparedStatement ps = null;// 预编译
		try {
			//注册驱动
			Class.forName(driver);
			// 获得数据库的链接
			conn = DriverManager.getConnection(url, uname, pword);
			// 用预编译来控制驱动完成sql命令
			ps = conn.prepareStatement(sqlUpdate);// 三部曲结束
			// 将参数放进暂定符？？内 set设置
			ps.setString(1, elve1);
			ps.setString(2, elve2);
			ps.setString(3, elve3);
			ps.setInt(4, badge);
			ps.setInt(5, eifBall);
			ps.setString(6, uername);	
			// 增删改 execute执行 Update更新
			int count = ps.executeUpdate();
			System.out.println("更新成功");
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
