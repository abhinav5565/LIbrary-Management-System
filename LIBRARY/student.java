import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class student implements ActionListener
{
JFrame f;
JLabel l;
JButton b,b1,b3;
student()
{
f=new JFrame("LIBRARY");
f.setSize(1366,768);
f.setLocation(0,0);
f.setLayout(null);
l=new JLabel();
l.setBounds(0,0,1366,768);
f.add(l);
ImageIcon img=new ImageIcon("a1.jpg");
l.setIcon(img);

b=new JButton("Student Login ");
b.setBounds(300,300,180,100);
l.add(b);

b1=new JButton("View Student");
b1.setBounds(600,300,180,100);
l.add(b1);
b3=new JButton("Home");
b3.setBounds(900,300,180,100);
l.add(b3);
b.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b1.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b3.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b.setContentAreaFilled(false);
b1.setContentAreaFilled(false);
b3.setContentAreaFilled(false);
b.setForeground(Color.white);
b1.setForeground(Color.white);
b3.setForeground(Color.white);
f.setVisible(true);
b.addActionListener(this);
b1.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b)
	{
		f.setVisible(false); 
		studentlogin a1= new studentlogin();
	}
	
	if(ae.getSource()==b1)
	{
		f.setVisible(false); 
		viewstudent a1= new viewstudent();
	}
if(ae.getSource()==b3)
	{
		f.setVisible(false); 
		first1 q2= new first1();
	}	
	
}

}