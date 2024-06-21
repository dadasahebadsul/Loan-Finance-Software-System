import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.*;

public class ViewOneUser  implements ActionListener
{
	static JFrame f=new JFrame("Database Records");

	private static JPanel jpRec = new JPanel();

	private static JLabel lbcash_id;
	private static JLabel lbName;
	private static JLabel lbmobile_no;
	private static JLabel lbemail_address;
	private static JLabel lbaddress;
	//private static JLabel lbservices;
	private static JLabel lbcompany_name;
	private static JLabel lbannual_income;
	//private static JLabel lbpast_loan;
	private static JLabel lbpan_card;

	private static JTextField txtcash_id;
	private static JTextField txtName;
	private static JTextField txtmobile_no;
	private static JTextField txtemail_address;
	private static JTextField txtaddress;
	//private static JComboBox item;
	private static JTextField txtcompany_name;
	private static JTextField txtannual_income;
	//private static JComboBox item1;
	private static JTextField txtpan_card;
	private static JTextField txtRec;

	private static JButton btndelete;
	private static JButton btncancel;
	

	private static int recCount = 0;
	private static	int total = DisplyAllRecords.row;

	static void populateArray ()
	{
		f.setSize (500, 400);
		f.setBackground(Color.GRAY);
		f.setResizable(false);
		f.setLocationRelativeTo(null);

		jpRec.setLayout (null);

		lbcash_id = new JLabel ("ID :-");
		lbcash_id.setForeground (Color.black);
		lbcash_id.setBounds (15, 20, 80, 25);

        lbName = new JLabel ("Name:");
		lbName.setForeground (Color.black);
        lbName.setBounds (15, 55, 80, 25);

		lbmobile_no = new JLabel ("mobile no:-");
		lbmobile_no.setForeground (Color.black);
		lbmobile_no.setBounds (15, 90, 100, 25);
		
		lbemail_address = new JLabel ("email_address:-");
		lbemail_address.setForeground (Color.black);
		lbemail_address.setBounds (15, 125, 100, 25);
		
		lbaddress = new JLabel ("address:-");
		lbaddress.setForeground (Color.black);
		lbaddress.setBounds (15, 160, 100, 25);
		
		/*lbservices = new JLabel ("services:-");
		lbservices.setForeground (Color.black);
		lbservices.setBounds (15, 195, 100, 25);*/
		
		lbcompany_name = new JLabel ("company_name:-");
		lbcompany_name.setForeground (Color.black);
		lbcompany_name.setBounds (15, 195, 100, 25);
		
		lbannual_income = new JLabel ("annual_income:-");
		lbannual_income.setForeground (Color.black);
		lbannual_income.setBounds (15, 230, 100, 25);
		
		/*lbpast_loan = new JLabel ("past_loan:-");
		lbpast_loan.setForeground (Color.black);
		lbpast_loan.setBounds (15, 230, 100, 25);*/
		
		lbpan_card = new JLabel ("pan_card:-");
		lbpan_card.setForeground (Color.black);
		lbpan_card.setBounds (15, 265, 100, 25);



		txtcash_id = new JTextField ();
		txtcash_id .setFont(new Font("Arial",Font.BOLD,20));
		txtcash_id .setHorizontalAlignment (JTextField.CENTER);
		txtcash_id .setBounds (125, 20, 200, 25);
		txtcash_id .setEnabled(false);

		txtName = new JTextField ();
		txtName.setFont(new Font("Arial",Font.BOLD,20));
		txtName.setHorizontalAlignment (JTextField.CENTER);
		txtName.setEnabled (false);
		txtName.setBounds (125, 55, 200, 25);

		txtmobile_no = new JTextField ();
		txtmobile_no.setFont(new Font("Arial",Font.BOLD,20));
		txtmobile_no.setHorizontalAlignment (JTextField.CENTER);
		txtmobile_no.setEnabled (false);
		txtmobile_no.setBounds (125, 90, 200, 25);
		
		txtemail_address = new JTextField ();
		txtemail_address.setFont(new Font("Arial",Font.BOLD,20));
		txtemail_address.setHorizontalAlignment (JTextField.CENTER);
		txtemail_address.setEnabled (false);
		txtemail_address.setBounds (125, 125, 200, 25);
		
		txtaddress = new JTextField ();
		txtaddress.setFont(new Font("Arial",Font.BOLD,20));
		txtaddress.setHorizontalAlignment (JTextField.CENTER);
		txtaddress.setEnabled (false);
		txtaddress.setBounds (125, 160, 200, 25);
		
		txtcompany_name = new JTextField ();
		txtcompany_name .setHorizontalAlignment (JTextField.CENTER);
		txtcompany_name .setEnabled (false);
		txtcompany_name .setBounds (125, 195, 200, 25);
		
		txtannual_income = new JTextField ();
		txtannual_income.setFont(new Font("Arial",Font.BOLD,20));
		txtannual_income.setEnabled (false);
		txtannual_income.setBounds (125, 230, 200, 25);
		
		txtpan_card = new JTextField ();
		txtpan_card.setFont(new Font("Arial",Font.BOLD,20));
		txtpan_card.setEnabled (false);
		txtpan_card.setBounds (125, 265, 200, 25);

		btndelete = new JButton ("delete");
		btndelete.setBounds (100, 290, 100, 40);
		btndelete.addActionListener (new ViewOneUser());

		btncancel = new JButton ("cancel");
		btncancel.setBounds (220, 290, 100, 40);
		btncancel.addActionListener (new ViewOneUser());

		
		txtRec = new JTextField ();
		txtRec.setEnabled (false);
		txtRec.setHorizontalAlignment (JTextField.CENTER);
		txtRec.setBounds (130, 200, 70, 25);

		jpRec.add (lbcash_id);
		jpRec.add (txtcash_id);
		jpRec.add (lbName);
		jpRec.add (txtName);
		jpRec.add (lbmobile_no);
		jpRec.add (txtmobile_no);
		jpRec.add (lbemail_address);
		jpRec.add (txtemail_address);
		jpRec.add (lbaddress);
		jpRec.add (txtaddress);
		jpRec.add (lbcompany_name);
		jpRec.add (txtcompany_name);
		jpRec.add (lbannual_income);
		jpRec.add (txtannual_income);
		jpRec.add (lbpan_card);
		jpRec.add (txtpan_card);
		jpRec.add (btndelete);
		jpRec.add (btncancel);
		
		jpRec.add (txtRec);

		f.getContentPane().add (jpRec);

		showRec (0);

		f.setVisible (true);
	}

	public void actionPerformed (ActionEvent ae)
	{
		Object obj = ae.getSource();

		if (obj == btndelete)
		{
			
			DeleteFromDatabase.delete(txtcash_id.getText()) ;
		}
		else if (obj == btncancel)
		{
			f.dispose();
		}
		f.dispose();
		frame_1 obj1 = new frame_1();
		
	}

	public static void showRec (int intRec)
	{
		txtcash_id.setText (DisplyAllRecords.rows[intRec][0]);
		txtName.setText (DisplyAllRecords.rows[intRec][1]);
		txtmobile_no.setText (DisplyAllRecords.rows[intRec][2]);
		txtemail_address.setText (DisplyAllRecords.rows[intRec][3]);
		txtaddress.setText (DisplyAllRecords.rows[intRec][4]);
		txtcompany_name.setText (DisplyAllRecords.rows[intRec][5]);
		txtannual_income.setText (DisplyAllRecords.rows[intRec][6]);
		txtpan_card.setText (DisplyAllRecords.rows[intRec][7]);

		if (total == 0)
			txtRec.setText (intRec + "/" + total); //Showing Record No. and Total Records.
		else
			txtRec.setText ((intRec + 1) + "/" + total); //Showing Record No. and Total Records.
	}
}








