import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class addstudent implements ActionListener
{
JFrame f;
JLabel l,l1,l2,l3,l4,l5,l6,l7;
JTextField t1,t2,t3,t4,t5,t6,t7;
JButton b1,b2;
addstudent()
{
f =new JFrame("LIBRARY");
f.setSize(1366,768);
f.setLocation(0,0);
f.setLayout(null);
l=new JLabel();
l.setBounds(0,0,1366,768);
Font f1 = new Font("ELEPHANT",Font.BOLD,28);
ImageIcon img=new ImageIcon("a5.jpg");
l.setIcon(img);
f.add(l);

l1=new JLabel("Student ID");
l1.setBounds(300,100,200,30);
l.add(l1);
l1.setFont(f1);
l1.setForeground(Color.WHITE);

l2=new JLabel("Student Name");
l.add(l2);
l2.setBounds(300,180,300,30);
l2.setFont(f1);
l2.setForeground(Color.WHITE);
l3=new JLabel("Class ");
l3.setBounds(300,260,200,30);
l.add(l3);

l3.setFont(f1);
l3.setForeground(Color.WHITE);
l4=new JLabel("Section");
l4.setBounds(300,340,200,30);
l.add(l4);
l4.setFont(f1);
l4.setForeground(Color.WHITE);
l5=new JLabel("Email");
l5.setBounds(300,420,200,30);
l.add(l5);
l5.setFont(f1);
l5.setForeground(Color.WHITE);
l6=new JLabel("Contact no");
l6.setBounds(300,500,200,30);
l.add(l6);
l6.setFont(f1);
l6.setForeground(Color.WHITE);
l7=new JLabel("Password");
l7.setBounds(300,580,200,30);
l.add(l7);
l7.setFont(f1);
l7.setForeground(Color.WHITE);


t1=new JTextField();
t1.setBounds(700,100,100,30);
l.add(t1);
t2=new JTextField();
t2.setBounds(700,180,100,30);
l.add(t2);
t3=new JTextField();
t3.setBounds(700,260,100,30);
l.add(t3);
t4=new JTextField();
t4.setBounds(700,340,100,30);
l.add(t4);
t5=new JTextField();
t5.setBounds(700,420,100,30);
l.add(t5);
t6=new JTextField();
t6.setBounds(700,500,100,30);
l.add(t6);
t7=new JTextField();
t7.setBounds(700,580,100,30);
l.add(t7);


b1=new JButton("Add Student");
b1.setBounds(500,630,200,50);
l.add(b1);
b2=new JButton("Back");
b2.setBounds(700,630,200,50);
l.add(b2);
b1.setContentAreaFilled(false);
b1.setForeground(Color.white);
b2.setContentAreaFilled(false);
b2.setForeground(Color.white);
b1.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b2.setFont(new Font("ELEPHANT", Font.PLAIN, 20));

f.setVisible(true);
b1.addActionListener(new addstudent2(t1,t2,t3,t4,t5,t6,t7));
b2.addActionListener(this);


}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b2)
	{
		f.setVisible(false); 
		second s= new second();
	}
	
	
}
}