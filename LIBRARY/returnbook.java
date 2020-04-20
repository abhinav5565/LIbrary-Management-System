import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

class returnbook implements ActionListener , FocusListener
{
	JFrame f;
	JTextField t;
	JLabel l,l1,l2;
	JButton b,b1;
	JComboBox cb;
	java.util.Calendar calender = Calendar.getInstance();
	
	returnbook()
	{
		f=new JFrame("LIBRARY");
		f.setLocation(0,0);
		f.setSize(1366,768);
		f.setLayout(null);
		f.setBounds(0,0,1366,768);
		l=new JLabel();
		ImageIcon img=new ImageIcon("a3.jpg");
		l.setIcon(img);
		l.setBounds(0,0,1366,768);
		f.add(l);
		Font f2 = new Font("ELEPHANT",Font.BOLD,20);
		
		l1=new JLabel("Enter BOOK ID");
		l1.setBounds(400,200,200,30);
		l.add(l1);
		l1.setFont(f2);
		l1.setForeground(Color.WHITE);
		
		l2=new JLabel("Student ID");
		l2.setBounds(400,300,200,30);
		l.add(l2);
		l2.setFont(f2);
		l2.setForeground(Color.WHITE);
		
		cb = new JComboBox();
		cb.setBounds(700,300,100,30);
		l.add(cb);
		
		t=new JTextField();
		t.setBounds(700,200,100,30);
		l.add(t);
		
		b=new JButton("Return Book");
		b.setForeground(Color.WHITE);
		b.setBounds(450,400,200,50);
		l.add(b);
		b.setFont(f2);
		b1=new JButton("Back");
		b1.setForeground(Color.WHITE);
		b1.setBounds(650,400,200,50);
		l.add(b1);
		b1.setFont(f2);
		
		b.addActionListener(this);
		b.setContentAreaFilled(false);
		
		b1.addActionListener(this);
		b1.setContentAreaFilled(false);
		t.addFocusListener(this);
		f.setVisible(true);
		
		
	
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		{
				String bid=t.getText();
				try
				{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
				Statement stat=con.createStatement();
				ResultSet rs=stat.executeQuery("select * from book " );

				while(rs.next())
				{
					String st=rs.getString("stock");
					int st1 = Integer.parseInt(st);
					st1=st1+1;
					//System.out.println(st1);
					stat.executeUpdate("update book set stock='"+st1+"' where id='"+bid+"' ");
					
				}
				
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				String ne =(String)cb.getSelectedItem();
				
				try
				{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
				Statement stat=con.createStatement();
				ResultSet rs=stat.executeQuery("select * from issue where student_id=('"+ne+"')" );
				
				while(rs.next())
				{
					String retdate=rs.getString("date_issue");
					System.out.println(retdate);
					
					
					java.util.Date date=new java.util.Date();
					SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
					String ndate=format.format(date);
					
					Date date1 =format.parse(retdate);
					Date date2 =format.parse(ndate);
					long diff = date2.getTime()-date1.getTime();
					long daysbetween= (diff/(1000*60*60*24));
					System.out.println(daysbetween);
					
					if(daysbetween<=15)
					{
						long ldays=15-daysbetween;
						String day=ldays+" Days Left";
						System.out.println(day);
						String fine="No Fine";
						System.out.println(fine);
					}
					else if((daysbetween>15)&&(daysbetween<=25))
					{
						long ldays=daysbetween-15;
						String day=ldays+"Days \n Extra";
						System.out.println(day);
						long fine=ldays*5;
						System.out.println("Rs "+fine);
						
						
					}
						
				}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				try
				{

					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
					Statement stat=con.createStatement();
					stat.executeUpdate("delete from issue where student_id=('"+ne+"')");
					t.setText("");
					cb.removeAllItems();
	
				}
				catch(Exception e)
				{
					System.out.println(e);
				}	
				
				
		}
		
	
	if(ae.getSource()==b1)
	{
		f.setVisible(false);
		second u=new second();
	}
}


public void focusLost(FocusEvent fe)
{
	if(fe.getSource()==t)
	{
		String bid=t.getText();
		int ctr1=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select book_id from issue");
			while(rs.next())
			{
				String bid1=rs.getString("book_id");
				if(bid.equals(bid1))
				{
				ctr1++;
				}
			}
			//System.out.println(ctr1);
			if(ctr1!=0)
			{
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
			stat=con.createStatement();
			rs=stat.executeQuery("select * from issue where book_id='"+bid+"'");
			while(rs.next())
			{
				cb.addItem(rs.getString("student_id").toString());
		
			}
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
			}
			else 
			{
			JOptionPane.showMessageDialog(null,"Book id not correct");
			t.setText("");
			}
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}


public void focusGained(FocusEvent fee)
{
	if(fee.getSource()==t)
	{
		cb.removeAllItems();
	}
}
}