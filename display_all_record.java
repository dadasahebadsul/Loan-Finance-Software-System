import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class display_all_record {static String rows[][] = new String [100][10];

static int row=0;
public static void display4() 
{	  
   try
   {
	DAO db=new DAO();
	Connection conn=db.getConnection();
			
    String selectQuery = "select * from  enquiry";
    	    	    
    PreparedStatement preparedStatement = 
    	conn.prepareStatement(selectQuery);

    ResultSet result = preparedStatement.executeQuery();
      	      
    while (result.next())
    {	    	
		for (int i = 0; i < 10; i++)
			rows[row][i] =result.getString((i+1));
			row++;
		
    }
    ViewCustomer.populateArray(rows);
   // ViewOneUser.populateArray();
  }
  catch(Exception e)
  {
	System.out.println(e);
  }
  
}
/*public static void main(String[] args) throws Exception 
{
	DisplyAllRecords.display();
}*/
}



