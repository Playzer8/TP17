package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnexionBDD 
{	
	public static Connection getConnexion() throws SQLException
	{
		Connection connex = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/tp17", "root", "root");
		
		return connex;
	}

}
