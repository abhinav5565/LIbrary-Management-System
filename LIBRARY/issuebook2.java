import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.logging.SimpleFormatter;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class issuebook2  implements ActionListener , FocusListener
{
JTextField t1,t5,t6,t7;
JComboBox cb2,cb3,cb4;

java.util.Date date=new java.util.Date();
SimpleDateFormat q=new SimpleDateFormat("dd/MM/yyyy");
String strdate=q.format(date);



Calendar calender = Calendar.getInstance();


issuebook2(JTextField t1,JComboBox cb2,JComboBox cb3,JComboBox cb4,JTextField t5,JTextField t6,JTextField t7)
{
t1.addFocusListener(this);
cb2.addFocusListener(this);
cb3.addFocusListener(this);
cb4.addFocusListener(this);
this.t1=t1;
this.cb2=cb2;
this.cb3=cb3;
this.cb4=cb4;
this.t6=t6;
this.t5=t5;
this.t7=t7;
		
		t6.setText(strdate);
		
		calender.add(calender.DATE,+15);
		String strdate1=q.format(calender.getTime());
		t7.setText(strdate1);
		

	t5.setEditable(false);
	t6.setEditable(false);
	t7.setEditable(false);
}
public void actionPerformed(ActionEvent ae)
{
	
String s1=t1.getText();
String s2=cb2.getSelectedItem().toString();
String s3=cb3.getSelectedItem().toString();
String s4=cb4.getSelectedItem().toString();
String s5=t5.getText();
String s6=t6.getText();
String s7=t7.getText();
int aaa=0;


try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
Statement stat=con.createStatement();
ResultSet rs=stat.executeQuery("select * from book " );

while(rs.next())
{
	String st=rs.getString("stock");
	String id=rs.getString("id");
	int st1 = Integer.parseInt(st);
	if(id.equals(s5))
	{
		System.out.println("helo");
if(st1>0)
{
	st1=st1-1;
	System.out.println(st1);
	stat.executeUpdate("update book set stock='"+st1+"' where id='"+s5+"' ");
 aaa=2;
 break;
}
else
{
		JOptionPane.showMessageDialog(null,"book not available");
	break;

}
}
}
}

catch(Exception e)
{
System.out.println(e);
}
if(aaa==2)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
Statement stat=con.createStatement();
stat.executeUpdate("insert into issue values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')");
t1.setText("");
t5.setText("");

cb2.removeAllItems();
cb3.removeAllItems();
cb4.removeAllItems();

}
catch(Exception e)
{
System.out.println(e);
}
JOptionPane.showMessageDialog(null,"Book issued");
}
}
public void focusLost(FocusEvent ae)
{		
if(ae.getSource()==t1)
{
	
	String sid=t1.getText();	
	int ctr1=0;
    try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
	Statement stat=con.createStatement();
	ResultSet rs=stat.executeQuery("select student_id from student" );
	while(rs.next())
	{
		String sid1 =rs.getString("student_id");
		if(sid.equals(sid1))
		{
			ctr1++;
		}
	}
	System.out.println(ctr1);
	if(ctr1!=0)
	{
		try
	{
	Class.forName("com.mysql.jdbc.Driver");
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
 stat=con.createStatement();
	 rs=stat.executeQuery("select distinct(name) from book");
	while(rs.next())
	{
		cb2.addItem(rs.getString("name"));
		
	}
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	
	}
	else 
	{
		JOptionPane.showMessageDialog(null,"id not correct");
        t1.setText("");
	}
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
}
	if(ae.getSource()==cb2)
	{
	String ne =(String)cb2.getSelectedItem();
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
	Statement stat=con.createStatement();
	ResultSet rs=stat.executeQuery("select * from book where name='"+ne+"'");
	while(rs.next())
	{
		
		//String au=rs.getString("author");
		cb3.addItem(rs.getString("author").toString());
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	if(ae.getSource()==cb3)
	{
		String au1 =(String)cb3.getSelectedItem();
		try
	{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
	Statement stat=con.createStatement();
	ResultSet rs=stat.executeQuery("select * from book where author='"+au1+"'");
	while(rs.next())
	{
		
		//String au=rs.getString("author");
		cb4.addItem(rs.getString("edition").toString());
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	if(ae.getSource()==cb4)
	{
		
		try
	{
		String id1 =(String)cb4.getSelectedItem();
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
	Statement stat=con.createStatement();
	ResultSet rs=stat.executeQuery("select * from book where edition='"+id1+"'");
	while(rs.next())
	{
		
		//String id2=rs.getString("id");
		t5.setText(rs.getString("id").toString());
	}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}

public void focusGained(FocusEvent fe)
{
	if(fe.getSource()==t1)
{
	cb2.removeAllItems();
	cb3.removeAllItems();
	cb4.removeAllItems();
	t5.setText("");
}
if(fe.getSource()==cb2)
{
	cb3.removeAllItems();
	cb4.removeAllItems();
	t5.setText("");
	
}
if(fe.getSource()==cb3)
{
	cb4.removeAllItems();
	t5.setText("");
	
}
if(fe.getSource()==cb4)
{
	t5.setText("");
	
}
}
}
