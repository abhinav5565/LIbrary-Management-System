import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class deletebook2 implements ActionListener
{
	JTextField t1;
	deletebook2(JTextField t1)
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
stat.executeUpdate("delete from book where id=('"+s1+"')");
t1.setText("");
}
catch(Exception e)
{
System.out.println(e);
}
}
}