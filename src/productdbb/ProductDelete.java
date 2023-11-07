package productdbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDelete {
	public static void main(String[] args) throws Exception {
		String className="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/productdb";
		String user = "root";
		String password = "root";
		String sql = "DELETE FROM PRODUCT WHERE  ID = 2";
		
		
		Class.forName(className);
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		int delete = statement.executeUpdate(sql);
		
		if (delete != 0) {
			System.out.println("Value deleted");
		}
		else {
			System.out.println("Not deleted");
		}
	
		connection.close();
}
}
