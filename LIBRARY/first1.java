import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class first1 implements ActionListener
{
JFrame f;
JLabel l,l1;
JButton b,b1;
first1()
{
f=new JFrame("LIBRARY");
f.setSize(1366,768);
f.setLocation(0,0);
f.setLayout(null);
l=new JLabel();
l.setBounds(0,0,1366,768);
f.add(l);
ImageIcon img=new ImageIcon("a.jpg");
l.setIcon(img);

l1=new JLabel("LIBRARY MANAGEMENT");
l1.setBounds(450,100,500,100);
l.add(l1);
l1.setFont(new Font("ELEPHANT", Font.BOLD, 30)); 
l1.setForeground(Color.GRAY);

b=new JButton("Librarian ");
b.setBounds(400,300,180,100);
l.add(b);
b.setFocusPainted(false);
//b.setBorderPainted(false);
b.setContentAreaFilled(false);
b.setFont(new Font("ELEPHANT", Font.PLAIN, 20)); 

b1=new JButton("Student");
b1.setBounds(700,300,180,100);
l.add(b1);
b1.setFocusPainted(false);
//b1.setBorderPainted(false);
b1.setContentAreaFilled(false);
b1.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b.setForeground(Color.white);
b1.setForeground(Color.white);
f.setVisible(true);
b.addActionListener(this);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
	
	if(ae.getSource()==b)
	{
		f.setVisible(false); 
		first q1=new first();
	}
	if(ae.getSource()==b1)
	{
		f.setVisible(false); 
		student q2=new student();
	}	
}
public static void main(String[] arg)
{
first1 a=new first1();
}
}