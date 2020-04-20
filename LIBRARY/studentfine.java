import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class studentfine 
{
	JFrame f;
	JPanel p;
	JTextField t1;
	studentfine(JTextField t1)
	{
		f=new Jframe("Library");
		p=new JPanel();
		f.add(p);
		f.setBounds(0,0,1366,768);
		p.setBounds(0,0,1366,768);
		f.setLocation(0,0);
		f.setSize(1366,768);
		f.setLayout(null);
		p.setLayout(null);
		f.setVisible(true);
		
		
		
	}
	
}