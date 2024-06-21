import java.io.*;
import java.sql.*;

public class DeleteFromDatabase 
{
	public static void delete(String cash_id) 
	{	   	
	 try
	  {
		DAO db=new DAO();
		Connection conn=db.getConnection();
				
 	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   
	  ;
	   	   
	    String deleteQuery = "delete from enquiry where cash_id=?";
		PreparedStatement preparedStatement;
		
		preparedStatement = conn.prepareStatement(deleteQuery);
		preparedStatement.setString(1,cash_id+"");
			
		int count = preparedStatement.executeUpdate();
		
		if(count==0)		
   		   System.out.println("No Recored Found with ID= !!!"+cash_id);
		else
		   System.out.println("Total "+count + " Records Deleted !!!");
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  }
}
