import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class aa2 implements FocusListener
{
JFrame f;
JTextField t1,t2;
aa2()
{
f=new JFrame ();
f.setSize(400,400);
f.setLocation(0,0);
f.setLayout(null);
t1=new JTextField();
t1.setBounds(100,100,100,30);
f.add(t1);
t1.addFocusListener(this);
t2=new JTextField();
t2.setBounds(100,200,100,30);
f.add(t2);
f.setVisible(true);
}
public void focusLost(FocusEvent ae)
{
	System.out.print("hello");
	
}
public void focusGained(FocusEvent fe)
{
	
}
public static void main(String[] arg)
{
	aa2 a =new aa2();
}
}

