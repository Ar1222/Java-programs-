import java.util.Scanner;
class maximum
{
public static Integer maximum(int n1,int n2)
{
int max;
if(n1>n2)
{
max=n1;
}
else
{
max=n2;
}
return max;
}
public static double maximum(double n1,double n2)
{
double max;
if(n1>n2)
{
max=n1;
}
else
{
max=n2;
}
return max;
}
public static void main(String arg[])
{
int a,b;
double c,d;
System.out.println("\t\tMETHOD OVERLOADING");
Scanner sc=new Scanner(System.in);
System.out.println("enter the integer value for a:");
a=sc.nextInt();
System.out.println("enter the integer value for b:");
b=sc.nextInt();
int result1=maximum(a,b);
System.out.println("maximum integer value is:"+result1);
System.out.println("enter the double value for c:");
c=sc.nextDouble();
System.out.println("enter the double value for d:");
d=sc.nextDouble();
double result2=maximum(c,d);
System.out.println("maximum double value is:"+result2);
}
}



