import java.util.Scanner;
class convert
{
  int num;
void convert1()
{
System.out.println("\t\t METODOVERRIDING");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
num=sc.nextInt();
}
}
class convertion extends convert
{
public void convert1()
{
super.convert1();
String hexa=Integer.toHexString(num);
System.out.println("hexadecimal number:"+hexa);
String octal=Integer.toOctalString(num);
System.out.println("octal number:"+octal);
String binary=Integer.toBinaryString(num);
System.out.println("binary number:"+binary);
}
}
class decimal
{
public static void main(String arg[])
{
convertion c=new convertion();
c.convert1();
}
}


