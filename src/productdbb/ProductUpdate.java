package productdbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String className="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/productdb";
		String user = "root";
		String password = "root";
		String sql = "UPDATE PRODUCT  SET NAME = 'ORANGE SUNSCREEN'  WHERE ID = 1";
		
		Class.forName(className);
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		int update = statement.executeUpdate(sql);
		
		if (update != 0) {
			System.out.println("Value updated");
		}
		else {
			System.out.println("Not updated");
		}
	
		connection.close();
	}


}
