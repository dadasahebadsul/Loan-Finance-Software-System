import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class add_enquiry implements ActionListener {

	/**
	 * @param args
	 */
	
	 JFrame f1;
	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	 JRadioButton rb1,rb2,rb3,rb4;
	 JComboBox cb1,cb2;
	 JButton b1,b2;
	 JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	public static void allrecord() {
		// TODO Auto-generated method stub
		add_enquiry obj =new add_enquiry();
	}
	
	add_enquiry(){
		
		f1=new JFrame();
    	f1.setSize(500,750);
    	f1.setLayout(null);
    	f1.setLocationRelativeTo(null);
        f1.getContentPane().setBackground(Color.cyan);
        
        l1=new JLabel("Enquiry Form");
    	l1.setBounds(120,20,300,30);
    	l1.setFont (new Font("Arial",Font.BOLD,28));
        f1.add(l1);
        
        l2=new JLabel(" cash ID :-");
    	l2.setBounds(30,80,100,30);
    	l2.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l2);
        
        tf1=new JTextField();
        tf1.setBounds(150,80,200,25);
		f1.add(tf1);
		
		l3=new JLabel("Name :-");
    	l3.setBounds(30,130,100,30);
    	l3.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l3);
        
        tf2=new JTextField();
        tf2.setBounds(150,130,250,25);
		f1.add(tf2);
		
		l4=new JLabel("mob no.:-");
    	l4.setBounds(30,180,100,30);
    	l4.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l4);
    	
        tf3=new JTextField();
        tf3.setBounds(150,180,250,25);
		f1.add(tf3);
		
		l5=new JLabel("Email address :-");
    	l5.setBounds(30,230,100,30);
    	l5.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l5);
        
        tf4=new JTextField();
        tf4.setBounds(150,230,250,25);
		f1.add(tf4);


    	l6=new JLabel("Address:-");
    	l6.setBounds(30,280,100,30);
    	l6.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l6);
       
    	
        tf5=new JTextField();
        tf5.setBounds(150,280,250,25);
		f1.add(tf5);
		
		l7=new JLabel("Service:-");
    	l7.setBounds(30,330,100,30);
    	l7.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l7);
        
        
   	 String item []={"self employe","JOB"};
	 cb1=new JComboBox(item);
	 cb1.setBounds(150,330,250,30);
	 f1.add(cb1);
        
       /* rb1=new JRadioButton("Self Employe");
	    rb1.setBounds(150,330,250,30);
		rb1.setFont (new Font("Arial",Font.BOLD,23));
		rb1.setForeground(Color.white);
	    rb1.setBackground(Color.GRAY);
		rb1.addActionListener(this);
	    f1.add(rb1);
		
	    
	    rb2=new JRadioButton("JOB");
	    rb2.setBounds(150,380,250,30);
		rb2.setFont (new Font("Arial",Font.BOLD,23));
		rb2.setForeground(Color.white);
	    rb2.setBackground(Color.GRAY);
		rb2.addActionListener(this);
	    f1.add(rb2);*/
	    
	    l8=new JLabel("Company/Business Name:-");
    	l8.setBounds(30,430,100,30);
    	l8.setFont (new Font("Arial",Font.BOLD,20));
        f1.add(l8);
        
        tf6=new JTextField();
        tf6.setBounds(150,430,250,25);
		f1.add(tf6);
		
		 l9=new JLabel("Annual Income:-");
	    	l9.setBounds(30,480,100,30);
	    	l9.setFont (new Font("Arial",Font.BOLD,20));
	        f1.add(l9);
	        
	        tf7=new JTextField();
	        tf7.setBounds(150,480,250,25);
			f1.add(tf7);
			
			 l10=new JLabel("past loan:-");
		    	l10.setBounds(30,530,100,30);
		    	l10.setFont (new Font("Arial",Font.BOLD,20));
		        f1.add(l10);
		        
		        String item1 []={"yes","no"};
		   	 cb2=new JComboBox(item1);
		   	 cb2.setBounds(150,530,100,30);
		   	 f1.add(cb2);
		        
		        
		        /*
		        rb3=new JRadioButton("YES");
			    rb3.setBounds(150,530,100,30);
				rb3.setFont (new Font("Arial",Font.BOLD,23));
				rb3.setForeground(Color.white);
			    rb3.setBackground(Color.GRAY);
				rb3.addActionListener(this);
			    f1.add(rb3);
			    
			    rb3=new JRadioButton("NO");
			    rb3.setBounds(260,530,100,30);
				rb3.setFont (new Font("Arial",Font.BOLD,23));
				rb3.setForeground(Color.white);
			    rb3.setBackground(Color.GRAY);
				rb3.addActionListener(this);
			    f1.add(rb3);
	    */
			    l11=new JLabel("pan card:-");
		    	l11.setBounds(30,580,100,30);
		    	l11.setFont (new Font("Arial",Font.BOLD,20));
		        f1.add(l11);
		        
		        tf8=new JTextField();
		        tf8.setBounds(150,580,250,25);
				f1.add(tf8);
				
				  b1=new JButton("OK");
				    b1.setBounds(140,630,150,25);
					b1.setFont (new Font("Arial",Font.BOLD,25));
					b1.addActionListener(this);
				    f1.add(b1);
				    
				    b2=new JButton("CANCEL");
				    b2.setBounds(300,630,150,25);
					b2.setFont (new Font("Arial",Font.BOLD,25));
					b2.addActionListener(this);
				    f1.add(b2);
				
	    
		f1.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getSource();
		if(ob==b2)
			f1.dispose();
		else 
			if(ob==b1){
				String item=(String) cb1.getItemAt(cb1.getSelectedIndex());
				String item1=(String) cb2.getItemAt(cb2.getSelectedIndex());
				InsertIntoDatabase.insert(tf1.getText(),tf2.getText(),tf3.getText(),tf4.getText(),tf5.getText(),item,tf6.getText(),tf7.getText(),item1,tf8.getText());
			}
		f1.dispose();
		frame_1 obj = new frame_1();
	}

}
