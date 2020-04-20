import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class deletebook implements ActionListener
{
JFrame f;
JLabel l,l1;
JTextField t1;
JButton b1,b2;
deletebook()
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

l1=new JLabel("Book ID");
l1.setBounds(300,100,200,30);
l.add(l1);
l1.setFont(f1);
l1.setForeground(Color.WHITE);
t1=new JTextField();
t1.setBounds(600,100,100,30);
l.add(t1);
b1=new JButton("Delete Book");
b1.setBounds(500,600,200,50);
l.add(b1);
b2=new JButton("Back");
b2.setBounds(700,600,200,50);
l.add(b2);
b1.setContentAreaFilled(false);
b1.setForeground(Color.white);
b2.setContentAreaFilled(false);
b2.setForeground(Color.white);
b1.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b2.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
f.setVisible(true);
b1.addActionListener(new deletebook2(t1));
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