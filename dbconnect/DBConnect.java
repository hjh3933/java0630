package org.project.product.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection getConnect() {

		Connection con = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		try {
			Class.forName(driver);
			System.out.println("OK");

			con = DriverManager.getConnection(url, user, password);
			System.out.println("Oracle DB ���� OK");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� No");
		} catch (SQLException e) {
			System.out.println("DB No");
		}
		
		
		return con;
	}
}
