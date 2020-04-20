import java.io.*;
class stream
{
InputStreamReader inp= new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(inp);
void sum()throws IOException
{
try
{
String s1=br.readLine();
int i=Integer.parseInt(s1);
String s2=br.readLine();
int j=Integer.parseInt(s2);
int k=i+j;
System.out.println(k);
}
catch(NumberFormatException e)
{
	System.out.println(e);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
}
void div()throws IOException
{
try
{
String s1=br.readLine();
int i=Integer.parseInt(s1);
String s2=br.readLine();
int j=Integer.parseInt(s2);
int k=i/j;
System.out.println(k);
}
catch(NumberFormatException e)
{
	System.out.println(e);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
}
void sub()throws IOException
{
try
{
String s1=br.readLine();
int i=Integer.parseInt(s1);
String s2=br.readLine();
int j=Integer.parseInt(s2);
int k=i-j;
System.out.println(k);
}
catch(NumberFormatException e)
{
	System.out.println(e);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
}
public static void main(String[] arg) throws IOException
{
	stream a = new stream();
	a.sum();
	a.div();
	a.sub();
}
}