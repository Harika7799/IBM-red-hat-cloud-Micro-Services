package comm.example.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyConnectionFactory {
	
	private Connection conn;
	private static MyConnectionFactory mcf;
	private MyConnectionFactory() throws SQLException
	{
		conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
	}
	public static MyConnectionFactory createFactory() throws SQLException
	{
		if(mcf == null)
		{
			mcf =new MyConnectionFactory();
		}
		return mcf;
	}
	public Connection getMyConnection() {
		return conn;
	}

}
