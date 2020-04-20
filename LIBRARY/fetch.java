import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class fetch implements ActionListener
{

public void actionPerformed(ActionEvent ae)
{

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
Statement stat=con.createStatement();
ResultSet rs=stat.executeQuery("select * from login");
while(rs.next())
{
String id=rs.getString("id");
String password=rs.getString("password");
System.out.println(id+"      "+password);

}
}
catch(Exception e)
{
System.out.println(e);
}
}

public static void main(String[] arg)
{
fetch a=new fetch();
}
}

