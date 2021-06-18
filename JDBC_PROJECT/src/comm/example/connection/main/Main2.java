package comm.example.connection.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main2 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			String url ="jdbc :mysql://localhost:3306/hr";
			Properties info =new Properties();
			info.put("user", "root");
			info.put("password", "root");
			conn = DriverManager.getConnection(url, info);
			if(conn != null) {
				System.out.println("Succesfully Connected");
			}
		}catch(SQLException ex) {
			System.out.println("An error Occur:");
			ex.printStackTrace();
		}
	}

}
