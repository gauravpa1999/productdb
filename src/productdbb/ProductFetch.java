package productdbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductFetch {
	public static void main(String[] args) throws Exception {
		String className="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/productdb";
		String user = "root";
		String password = "root";
		String sql = "SELECT *  FROM PRODUCT";
		
		Class.forName(className);
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next())  {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.getDouble(3));
			System.out.println(resultSet.getString(4));
			System.out.println("----------------------------------");
			
			
		}
		resultSet.close();
		statement.close();
		connection.close();
	}
}
