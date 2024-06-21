import java.io.*;
import java.sql.*;

public class UpdateDatabaseRecords 
{
	public static void update(String cash_id,String name,String mobile_no,String email_address,String address,String services,String company_name,String annual_income,String past_loan,String pan_card)
	{	   	
	 try
	  {
		DAO db=new DAO();
		Connection conn=db.getConnection();
				
 	
	   	   
		String selectquery = "update enquiry set name=?,mobile_no=?,email_address=?,address=?,services=?,company_name=?,annual_income=?,past_loan=?,pan_card=? where cash_id=?";

		PreparedStatement pstmt = null;
		pstmt = conn.prepareStatement(selectquery);

		pstmt.setString(1, name);
		
		pstmt.setString(2,mobile_no);
		
		pstmt.setString(3,email_address);
		
		pstmt.setString(4,address);
		
		pstmt.setString(5,services);
		
		pstmt.setString(6,company_name);
		
		pstmt.setString(7,annual_income);
		
		pstmt.setString(8,past_loan);
		
		pstmt.setString(9,pan_card);

		pstmt.setString(10,cash_id+"");
				
		int count = pstmt.executeUpdate();
		
		if(count==0)		
   		   System.out.println("No Recored Found with ID= "+cash_id);
		else
			System.out.println("Record Id "+cash_id+ " Data Successfully Updated !!!");
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
  }
}
