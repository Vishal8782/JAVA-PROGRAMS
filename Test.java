import java.util.Scanner;
public class Test
{
Scanner scan = new Scanner(System.in);
Integer i;
public Test(Integer i)
{
this.i = i;

}
public void setInteger(Integer i)
{
this.i = i;

}
public Integer getInteger()
{
return i;

}
public static void main	(String args[])
{
final Test t1 = new Test(20);
System.out.println(t1.getInteger());

t1.setInteger(10);
System.out.println(t1.getInteger());

Test t2 = new Test(10);
System.out.println(t2.getInteger());

t1 = t2; //reference cant be changed
}


}