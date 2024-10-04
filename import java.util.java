import java.util.scanner;
class exception_handle
{
public static void main(String args[])
{
Exception ex = new exception();
}
}
class exception
{
exception()
{
Scanner S=new Scanner(system.in);
System.out.println("enter a and b values:");
int a=S.nextint();
int b=S.nextint();
try

{
int c=a/b;
System.out.print(c);
}
catch(arithmetic exception )
{
System.out.println("arthmatic exception occured");
}
}
}
