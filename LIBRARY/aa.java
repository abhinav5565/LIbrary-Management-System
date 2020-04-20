import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class aa implements ActionListener
{
JFrame f;
JLabel l,l1,l2;
JTextField t1,t2;
JButton b,b1,b2,b3,b4;
aa()
{
f=new JFrame("LIBRARY");

f.setSize(1366,768);
f.setLocation(0,0);
f.setLayout(null);
l=new JLabel();
l.setBounds(0,0,1366,768);
f.add(l);
ImageIcon img=new ImageIcon("a2.jpg");
l.setIcon(img);
Font f3 = new Font("ELEPHANT",Font.BOLD,28);
l1=new JLabel("id");
l.add(l1);
l1.setFont(f3);
l1.setForeground(Color.WHITE);
l1.setBounds(350,200,100,30);
l2=new JLabel("password");
l.add(l2);
l2.setBounds(350,300,200,30);
l2.setFont(f3);
l2.setForeground(Color.WHITE);
t1=new JTextField();
t1.setBounds(650,200,100,30);
l.add(t1);
t2=new JTextField();
t2.setBounds(650,300,100,30);
l.add(t2);

b=new JButton("Add Librarian");
b.setBounds(200,400,200,70);
l.add(b);

b1=new JButton("Remove Librarian");
b1.setBounds(500,400,250,70);
l.add(b1);
b2=new JButton("Update Librarian");
b2.setBounds(850,400,250,70);
l.add(b2);
b3=new JButton("View Librarian");
b3.setBounds(400,500,250,70);
l.add(b3);
b4=new JButton("Back");
b4.setBounds(700,500,200,70);
l.add(b4);
b.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b1.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b2.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b3.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b4.setFont(new Font("ELEPHANT", Font.PLAIN, 20));
b.setContentAreaFilled(false);
b.setForeground(Color.white);
b1.setContentAreaFilled(false);
b1.setForeground(Color.white);
b2.setContentAreaFilled(false);
b2.setForeground(Color.white);
b3.setContentAreaFilled(false);
b3.setForeground(Color.white);
b4.setContentAreaFilled(false);
b4.setForeground(Color.white);


f.setVisible(true);
b1.addActionListener(new cc1(t1));
b.addActionListener(new cc(t1,t2));
b2.addActionListener(new aupdate(t1,t2));
b3.addActionListener(this);
b4.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b3)
	{
		f.setVisible(false); 
		table a3= new table();
	}
	
	if(ae.getSource()==b4)
	{
		f.setVisible(false); 
		first a3= new first();
	}
	
}
public static void main(String[] arg)
{
aa a=new aa();
}
}

