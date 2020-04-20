import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class cc implements ActionListener
{
JTextField t1,t2;
cc(JTextField t1,JTextField t2)
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
stat.executeUpdate("insert into login values('"+s1+"','"+s2+"')");
t1.setText("");
	t2.setText("");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
