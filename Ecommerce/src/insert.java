import java.sql.*;
public class insert {

	public static void main (String [] args) throws Exception {
		getData();
	}
	
	public static void getData()throws Exception{ 
		String url="jdbc:mysql://127.0.0.1:3306/sesha";
		String username="root";
		String password="sesha2001";
//		String Query="insert into student values(?,?,?)"; //Its for insert data
		String Query= "Select*from student," ; // its for get 
		Connection con=DriverManager.getConnection(url, username, password);
//		PreparedStatement pts=con.prepareStatement(Query);//Its for insert data
		Statement pst =con.createStatement();
		ResultSet Rst = pst.executeQuery(Query);
		while (Rst.next()) {
			System.out.println("Name: " + Rst.getString(1));
			System.out.println("Age: " + Rst.getInt(2));
			System.out.println("Email: " + Rst.getString(3));
		}
//		pts.setString(1, "Sesha");//Its for insert data
//		pts.setInt(2, 22);//Its for insert data
//		pts.setString(3, "Sesha@gmail");//Its for insert data
//		pts.executeUpdate();//Its for insert data
		con.close();   	
	}	
}



//<<<<< its for insert value >>>>>

//import java.sql.*;
//public class insert {
//
//	public static void main (String []args) throws Exception {
//		schooldatas();	
//		
//	}
//	 public static void schooldatas() throws Exception{
//		String url="jdbc:mysql://127.0.0.1:3306/sesha";
//		String username = "root";
//		String password = "sesha2001";
//		String query= "insert into student values(?,?,?)";
//		Connection CON=DriverManager.getConnection(url, username, password);
//		PreparedStatement PTS=CON.prepareStatement(query);
//		PTS.setString(1, "Sudha");
//		PTS.setInt(2, 24);
//		PTS.setString(3, "Sudha@gmail");
//		PTS.executeUpdate();
//		PTS.close();
// 
//		 
//	 }
//	
//	
//}
