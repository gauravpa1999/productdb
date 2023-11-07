package productdbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Product {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root", "root");
		Statement statement = connection.createStatement();
		int count =statement.executeUpdate("INSERT INTO PRODUCT VALUES (3,'FRAGRANCE BODY SPRAY',275.00,'FOGG'),(4,'COCONUT OIL',63.00,'PARACHUTE')");
		if (count!=0) {
			System.out.println("Data inserted");
		} else {
			System.out.println("Data not inserted");
		}
		connection.close();
	}
}
