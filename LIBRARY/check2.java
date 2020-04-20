import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.sql.*;
class check2 implements DocumentListener 
{
	JFrame f;
	JPanel p;
	JTextField t;
	TableRowSorter sorter1;
	TableModel model;
check2()
{
f=new JFrame("LIBRARY");
p=new JPanel();
f.setBounds(0,0,1366,768);
p.setBounds(0,0,1366,768);

f.add(p);
p.setBackground(Color.white);
t=new JTextField();
t.setBounds(100,100,100,30);
f.add(t);
t.getDocument().addDocumentListener(this);
f.setLayout(null);
p.setLayout(null);
f.setVisible(true);
String data[][]=new String[30][6];
String cols[]={"student_id","student_name","class","section","email","contact_no"};
String s=t.getText();
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abhinav","root","");
Statement stat=con.createStatement();
ResultSet rs=stat.executeQuery("select * from student");
int j=0;
while(rs.next())
{

for(int i=0;i<6;i++)
{
data[j][i]=rs.getString(cols[i]);
}
j++;

}
rs.close();
model = new DefaultTableModel(data,cols);
sorter1 = new TableRowSorter(model);
JTable jt=new JTable(data,cols);
jt.setRowSorter(sorter1);
JScrollPane sp=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
sp.setBounds(200,200,1000,500);
p.add(sp);
}

catch(Exception e)
{
System.out.println(e);
}
}

public void insertUpdate(DocumentEvent e)
{
	search(t.getText());
}
public void removeUpdate(DocumentEvent e)
{
	search(t.getText());
}
public void changedUpdate(DocumentEvent e)
{
	search(t.getText());
}
public void search(String s)
{
	if(s.length()==0)
	{
		sorter1.setRowFilter(null);
	}
	else
	{
		sorter1.setRowFilter(RowFilter.regexFilter(s));
	}
	
}
}
