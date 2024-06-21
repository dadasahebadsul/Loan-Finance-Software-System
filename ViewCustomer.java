import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;

public class ViewCustomer
{
     static JFrame f=new JFrame("Database Records");
     static DefaultTableModel dtcustomer;
	 static JTable tbcustomer;
	 static JScrollPane jspTable;

	 static void populateArray (String rows[][])
	{
		JPanel jpShow = new JPanel ();

		int row = 0;
	
		int total = 0;

		f.setSize (675, 280);
		f.setLocation(200,200);

		tbcustomer = makeTable (rows);
		jspTable = new JScrollPane (tbcustomer);
		jspTable.setBounds (20, 20, 625, 200);

		jpShow.add (jspTable);
		jpShow.setLayout (null);

		f.getContentPane().add (jpShow);
        f.setAlwaysOnTop(true);
		f.setVisible (true);
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				f.dispose();
				frame_1 obj1 = new frame_1();
			}
		}
	  );
	}

	private static  JTable makeTable (String rowData[][])
	{
		String cols[] = {"cash_id", "name","mobile_no","email_address","address","services","company_name","annual_income","past_loan","pan_card"};

		dtcustomer  = new DefaultTableModel (rowData, cols);

		tbcustomer = new JTable (dtcustomer)
		{
			public boolean isCellEditable (int iRow, int iCol)
			{
				return false;	//Disable All Columns of Table.
			}
		};
		(
		tbcustomer.getColumnModel().getColumn(0)).setPreferredWidth (80);
		(tbcustomer.getColumnModel().getColumn(1)).setPreferredWidth (180);
		(tbcustomer.getColumnModel().getColumn(2)).setPreferredWidth (100);
		(tbcustomer.getColumnModel().getColumn(3)).setPreferredWidth (100);
		(tbcustomer.getColumnModel().getColumn(4)).setPreferredWidth (100);
		(tbcustomer.getColumnModel().getColumn(5)).setPreferredWidth (100);
		(tbcustomer.getColumnModel().getColumn(6)).setPreferredWidth (100);
		(tbcustomer.getColumnModel().getColumn(7)).setPreferredWidth (100);
		(tbcustomer.getColumnModel().getColumn(8)).setPreferredWidth (100);
		(tbcustomer.getColumnModel().getColumn(9)).setPreferredWidth (100);
		
		tbcustomer.setRowHeight (25);
		
		tbcustomer.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
		return tbcustomer;
	}

}