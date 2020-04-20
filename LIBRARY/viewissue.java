import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class viewissue implements ActionListener
{
	JFrame f;
	JPanel p;
	JButton b;
viewissue()
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
String data[][]=new String[30][7];
String cols[]={"student_id","book_name","author","edition","book_id","date_issue","date_return"};
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
Statement stat=con.createStatement();
ResultSet rs=stat.executeQuery("select * from issue");
int j=0;
while(rs.next())
{

for(int i=0;i<7;i++)
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
		second a4= new second();
	}
}
}
