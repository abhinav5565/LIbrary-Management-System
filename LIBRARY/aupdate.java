import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class aupdate implements ActionListener
{
JTextField t1,t2;
aupdate(JTextField t1,JTextField t2)
{
this.t1=t1;
this.t2=t2;
}
public void actionPerformed(ActionEvent ae)
{

String s1=t1.getText();
String s2=t2.getText();

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
Statement stat=con.createStatement();
stat.executeUpdate("update login set password='"+s2+"' where id='"+s1+"' ");
t1.setText("");
	t2.setText("");
}
catch(Exception e)
{
System.out.println(e);
}
}
}


