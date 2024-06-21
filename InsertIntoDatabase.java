import java.io.*;
import java.sql.*;

public class InsertIntoDatabase
{
	public static void insert(String cash_id,String name,String mobile_no,String email_id,String address,String services,String company_name,String annual_income,String post_loan,String pan_card)
	
	{
	 try
	  {
		DAO db=new DAO();
		Connection conn=db.getConnection();

 	   

	    String insertQuery = "insert into enquiry values(?,?,?,?,?,?,?,?,?,?)";

	    PreparedStatement preparedStatement;

	    preparedStatement = conn.prepareStatement(insertQuery);
	    preparedStatement.setString(1,cash_id+"");
	    preparedStatement.setString(2,name+"");
	    preparedStatement.setString(3,mobile_no+"");
	    preparedStatement.setString(4,email_id+"");
	    preparedStatement.setString(5,address+"");
	    preparedStatement.setString(6,services+"");
	    preparedStatement.setString(7,company_name+"");
	    preparedStatement.setString(8,annual_income+"");
	    preparedStatement.setString(9,post_loan+"");
	    preparedStatement.setString(10,pan_card+"");

	    preparedStatement.executeUpdate();

	    System.out.println("Data  Successfully Inserted !!!");
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  }
}





