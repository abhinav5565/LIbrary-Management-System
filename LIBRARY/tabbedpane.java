import javax.swing.*;
import java.awt.*;
class tabbedpane
{
JFrame f;
tabbedpane()
{
f=new JFrame();
JPanel p1=new JPanel();
p1.setBackground(Color.red);
JPanel p2=new JPanel();
JPanel p3=new JPanel();
p2.setBackground(Color.yellow);
p3.setBackground(Color.green);
JTabbedPane tp=new JTabbedPane();
tp.setBounds(50,50,100,200);
tp.add("main",p1);
tp.add("visit",p2);
tp.add("help",p3);
f.add(tp);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String[] arg)
{
	new tabbedpane();
	
}
}

