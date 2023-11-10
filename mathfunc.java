import java.util.Scanner;
import java.util.io.*;
class func
{
long a,b;
double c;
func(long a,long b,double c)
{
this.a=a;
this.b=b;
this.c=c;
}
void basicmathfunction()
{
System.out.println("\n\n\t\tMATH CLASS FUNCTION");
System.out.println("Basic math function");
System.out.println("Maximum:"+Math.max(a,b));
System.out.println("Minimum:"+Math.min(a,b));
System.out.println("power:"+Math.pow(a,b));
System.out.println("square root:"+Math.sqrt(b));
System.out.println("Round off:"+Math.round(c));
System.out.println("ceil:"+Math.ceil(c));
System.out.println("floor:"+Math.floor(c));
}
void logandangularmethod()
{
System.out.println("\n log and angular method");
System.out.println("degrees:"+Math.toDegrees(a));
System.out.println("radians:"+Math.toRadians(b));
System.out.println("exponent:"+Math.exp(a));
System.out.println("multiplication:"+Math.multiplyExact(b,a));
System.out.println("random:"+Math.random());
}
}
 public class mathfunc
{
public static void main(String args[])
{
long a,b;
double c;
Scanner sc =new Scanner(System.in);
System.out.println("\n Enter the value for a:");
a=sc.nextLong();
System.out.println("\n Enter the value for b:");
b=sc.nextLong();
System.out.println("\n Enter the value for c:");
c=sc.nextDouble();
func mf=new func(a,b,c);
mf.basicmathfunction();
mf.logandangularmethod();
}
}






