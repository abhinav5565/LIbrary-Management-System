import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class cc1 implements ActionListener
{
	JTextField t1;
	cc1(JTextField t1)
	{
		this.t1=t1;
	}
public void actionPerformed(ActionEvent ae)
{
	String s1 = t1.getText();
try
{

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
Statement stat=con.createStatement();
stat.executeUpdate("delete from login where id=('"+s1+"')");
t1.setText("");
	
}
catch(Exception e)
{
System.out.println(e);
}
}
}