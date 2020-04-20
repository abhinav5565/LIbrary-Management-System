import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class table implements ActionListener
{
	JFrame f;
	JPanel p;
	JButton b;
table()
{
f=new JFrame("LIBRARY");
p=new JPanel();
f.setBounds(0,0,1366,768);
p.setBounds(0,0,1366,768);
b=new JButton("back");
b.setBounds(550,620,200,50);
p.add(b);
f.add(p);
p.setBackground(Color.white);
f.setLayout(null);
p.setLayout(null);
b.addActionListener(this);
f.setVisible(true);
String data[][]=new String[30][2];
String cols[]={"id","password"};
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
Statement stat=con.createStatement();
ResultSet rs=stat.executeQuery("select * from login");
int j=0;
while(rs.next())
{

for(int i=0;i<2;i++)
{
data[j][i]=rs.getString(cols[i]);
}
j++;

}
rs.close();
JTable jt=new JTable(data,cols);
JScrollPane sp=new JScrollPane(jt);
sp.setBounds(100,100,1000,500);

p.add(sp);
}

catch(Exception e)
{
System.out.println(e);
}
}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b)
	{
		f.setVisible(false); 
		aa a3= new aa();
	}
}
}
