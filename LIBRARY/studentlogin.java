import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class studentlogin implements ActionListener
{
JFrame f;
JLabel l,l1,l2;
JTextField t1;
JPasswordField t2;
JButton b,b1;
studentlogin (JTextField)
{
f=new JFrame("LIBRARY");

f.setSize(1366,768);
f.setLocation(0,0);
f.setLayout(null);
l=new JLabel();
l.setBounds(0,0,1366,768);
f.add(l);
ImageIcon img=new ImageIcon("a3.jpg");
l.setIcon(img);
Font f2 = new Font("ELEPHANT",Font.BOLD,28);
l1=new JLabel("Student id");
l.add(l1);
l1.setFont(f2);
l1.setForeground(Color.WHITE);
l1.setBounds(400,200,200,30);

l2=new JLabel("password");
l.add(l2);
l2.setFont(f2);
l2.setForeground(Color.WHITE);
l2.setBounds(400,300,200,30);
t1=new JTextField();
t1.setBounds(700,200,100,30);
l.add(t1);
t2=new JPasswordField();
t2.setBounds(700,300,100,30);
l.add(t2);
t2.setEchoChar('*');
b=new JButton("submit");
b.setBounds(500,400,200,50);
l.add(b);
b.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b.setContentAreaFilled(false);
b.setForeground(Color.white);


f.setVisible(true);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b)
{
String s1=t1.getText();
String s2=t2.getText();
int ctr=0;
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
Statement stat=con.createStatement();
ResultSet rs=stat.executeQuery("select * from student where student_id='"+s1+"' and password='"+s2+"'");
while(rs.next())
{
ctr++;
}
if(ctr!=0)
{
	f.setVisible(false);
}
else
{
JOptionPane.showMessageDialog(null,"not correct");
t1.setText("");
t2.setText("");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
public static void main(String[] arg)
{
studentlogin a=new studentlogin();
}

}


