import java.sql.*;
public class school {

	public static void main (String []args) throws Exception {
		schooldatas();	
		
	}
	 public static void schooldatas() throws Exception{
		 
		String url ="jdbc:mysql://127.0.0.1:3306/School";
		String username = "root";
		String password = "sesha2001";
		String query= "insert into class_students values(?,?,?)";
		Connection CON=DriverManager.getConnection(url, username, password);
		PreparedStatement PTS=CON.prepareStatement(query);
		PTS.setString(1, "Kumar");
		PTS.setInt(2, 25);
		PTS.setString(3, "Mumbai");
		PTS.executeUpdate();
		PTS.close();
 
		 
	 }
	
	
}
