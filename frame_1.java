import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;


public class frame_1 implements ActionListener{

	/**
	 * @param args
	 * 
	 * */
	
	JFrame f1;
	 JProgressBar br;
	 JButton b1;
	 JButton b2;
	 JRadioButton rb1,rb2,rb3,rb4,rb5;
	 JLabel l1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frame_1 obj = new frame_1();
	}
	frame_1(){
		 f1=new JFrame();
		    f1.setSize(600,700);
		    f1.setLocationRelativeTo(null);
		    f1.setLayout(null);
		    f1.getContentPane().setBackground(Color.cyan);
		    
		    br=new JProgressBar();
		    br.setBounds(40,50,480,40);
		    br.setOrientation(0);
		    br.setBackground(Color.orange);
		    br.setFont(new Font("Times of Roman ",Font.BOLD,40));
		    br.setForeground(Color.blue);
		    br.setIndeterminate(true);
		    br.setString("  : MAVKAR FINANCE :  ");
		    br.setStringPainted(true);
		    f1.add(br);
		    
		    l1=new JLabel(" : MAVKAR FINANCE : ");
		    l1.setBounds(40,50,480,40);
		    f1.add(l1);
		    
		    rb1=new JRadioButton("Add Enquiry");
		    rb1.setBounds(50,150,170,23);
			rb1.setFont (new Font("Arial",Font.BOLD,23));
			rb1.setForeground(Color.white);
		    rb1.setBackground(Color.GRAY);
			rb1.addActionListener(this);
		    f1.add(rb1);
		    
		    rb2=new JRadioButton("Delete Enquiry");
		    rb2.setBounds(50,210,220,23);
			rb2.setFont (new Font("Arial",Font.BOLD,23));
			rb2.setForeground(Color.white);
		    rb2.setBackground(Color.GRAY);
			rb2.addActionListener(this);
		    f1.add(rb2);
		    
		    rb3=new JRadioButton("Update Record");
		    rb3.setBounds(50,270,210,23);
			rb3.setFont (new Font("Arial",Font.BOLD,23));
			rb3.setForeground(Color.white);
		    rb3.setBackground(Color.GRAY);
			rb3.addActionListener(this);
		    f1.add(rb3);
		    
		    rb4=new JRadioButton("Disply All");
		    rb4.setBounds(50,330,210,23);
			rb4.setFont (new Font("Arial",Font.BOLD,23));
			rb4.setForeground(Color.white);
		    rb4.setBackground(Color.GRAY);
			rb4.addActionListener(this);
		    f1.add(rb4);
		    
		    rb5=new JRadioButton("LOAN Services");
		    rb5.setBounds(50,390,210,23);
			rb5.setFont (new Font("Arial",Font.BOLD,23));
			rb5.setForeground(Color.white);
		    rb5.setBackground(Color.GRAY);
			rb5.addActionListener(this);
		    f1.add(rb5);
		    
		    b1=new JButton("OK");
		    b1.setBounds(140,430,150,25);
			b1.setFont (new Font("Arial",Font.BOLD,25));
			b1.addActionListener(this);
		    f1.add(b1);
		    
		    b2=new JButton("CANCEL");
		    b2.setBounds(300,430,150,25);
			b2.setFont (new Font("Arial",Font.BOLD,25));
			b2.addActionListener(this);
		    f1.add(b2);
		    
		    f1.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		f1.dispose();
		Object ob=e.getSource();
		if(ob==b2)
		f1.dispose();
		else
			if(ob==rb1)
				add_enquiry.allrecord();
		    if(ob==rb2)
		    	deletemedi.delete() ;
		    if(ob==rb3)
		    	update_id.updateid();
		    else if(ob==rb4)
				display_all_record.display4() ;
	}
	
	}


