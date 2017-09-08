//package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
	
	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/Students";
		Properties prop = new Properties();
		prop.setProperty("user", "test");
		prop.setProperty("password", "asdf1234");
		Connection conn = DriverManager.getConnection(url,prop);
		
		PreparedStatement prepareStatement = null;
		try {
			//Class.forName("org.postgresql.Driver");
			ResultSet executeQuery = conn.prepareStatement("SELECT * FROM STUDENTS").executeQuery();
			conn.prepareStatement( "SELECT * FROM STUDENTS").executeUpdate();
			while(executeQuery.next()) {
				System.out.println(executeQuery.getInt (1)+ "|" + executeQuery.getString(2));
			
			}
		}catch (Exception e) {
			System.out.println(e);	
		}finally {
			System.out.println("Test_close");	
			conn.close();
		}
		System.out.println("Finish");	
	}
}
