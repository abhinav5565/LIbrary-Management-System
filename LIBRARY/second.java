import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class second implements ActionListener
{
JFrame f;
JLabel l;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b10;

second ()
{
f =new JFrame("LIBRARY");
f.setSize(1366,768);
f.setLocation(0,0);
f.setLayout(null);
l=new JLabel();
l.setBounds(0,0,1366,768);
f.add(l);
ImageIcon img=new ImageIcon("a4.jpg");
l.setIcon(img);
b1=new JButton("Add Student");
b1.setBounds(300,100,250,80);
l.add(b1);
b2=new JButton("Add Book");
b2.setBounds(800,100,250,80);
l.add(b2);
b3=new JButton("Delete Book");
b3.setBounds(300,200,250,80);
l.add(b3);
b4=new JButton("Issue Book");
b4.setBounds(800,200,250,80);
l.add(b4);
b5=new JButton("Search Book");
b5.setBounds(300,300,250,80);
l.add(b5);
b6=new JButton("Return book");
b6.setBounds(800,300,250,80);
l.add(b6);    
b7=new JButton("View books");
b7.setBounds(300,400,250,80);
l.add(b7);
b8=new JButton("View Issued books");
b8.setBounds(800,400,250,80);
l.add(b8);

b10=new JButton("Sign Out");
b10.setBounds(550,550,250,80);
l.add(b10);
b1.setContentAreaFilled(false);
b1.setForeground(Color.white);
b2.setContentAreaFilled(false);
b2.setForeground(Color.white);
b3.setContentAreaFilled(false);
b3.setForeground(Color.white);
b4.setContentAreaFilled(false);
b4.setForeground(Color.white);
b5.setContentAreaFilled(false);
b5.setForeground(Color.white);
b6.setContentAreaFilled(false);
b6.setForeground(Color.white);
b7.setContentAreaFilled(false);
b7.setForeground(Color.white);
b8.setContentAreaFilled(false);
b8.setForeground(Color.white);
b10.setContentAreaFilled(false);
b10.setForeground(Color.white);
b10.setBackground(new Color(213,210,211));
b1.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b2.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b3.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b4.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b5.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b6.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b7.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b8.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b10.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
f.setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b10.addActionListener(this);
}	    
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		f.setVisible(false); 
		addstudent a7=new addstudent();
	}
	if(ae.getSource()==b2)
	{
		f.setVisible(false); 
		addbook a2=new addbook();
	}
		if(ae.getSource()==b3)
	{
		f.setVisible(false); 
		deletebook a2=new deletebook();
	}
	if(ae.getSource()==b4)
	{
		f.setVisible(false); 
		issuebook a8=new issuebook();
	}
	if(ae.getSource()==b5)
	{
		f.setVisible(false); 
		searchbook a11=new searchbook();
	}
	if(ae.getSource()==b6)
	{
		f.setVisible(false); 
		returnbook a13=new returnbook();
	}
	if(ae.getSource()==b7)
	{
		f.setVisible(false); 
		viewbook a5=new viewbook();
	}
	if(ae.getSource()==b8)
	{
		f.setVisible(false); 
		viewissue a6=new viewissue();
	}
	if(ae.getSource()==b10)
	{
		f.setVisible(false); 
		first a9=new first();
	}
}

}