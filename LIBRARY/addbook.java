import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class addbook implements ActionListener
{
JFrame f;
JLabel l,l1,l2,l3,l4,l5;
JTextField t1,t2,t3,t4,t5;
JButton b1,b2;
addbook()
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

l2=new JLabel("Book Name");
l.add(l2);
l2.setBounds(300,200,200,30);
l2.setFont(f1);
l2.setForeground(Color.WHITE);
l3=new JLabel("Author ");
l3.setBounds(300,300,200,30);
l.add(l3);

l3.setFont(f1);
l3.setForeground(Color.WHITE);
l4=new JLabel("Edition");
l4.setBounds(300,500,200,30);
l.add(l4);
l4.setFont(f1);
l4.setForeground(Color.WHITE);
l5=new JLabel("Stock");
l5.setBounds(300,400,200,30);
l.add(l5);
l5.setFont(f1);
l5.setForeground(Color.WHITE);

t1=new JTextField();
t1.setBounds(600,100,100,30);
l.add(t1);
t2=new JTextField();
t2.setBounds(600,200,100,30);
l.add(t2);
t3=new JTextField();
t3.setBounds(600,300,100,30);
l.add(t3);
t4=new JTextField();
t4.setBounds(600,400,100,30);
l.add(t4);
t5=new JTextField();
t5.setBounds(600,500,100,30);
l.add(t5);
b1=new JButton("Add Book");
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
b1.addActionListener(new addbook2(t1,t2,t3,t4,t5));
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