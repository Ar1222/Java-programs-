import java.util.Scanner;
import java.io.*;
class student
{
 int r_no;
String name;
void getdata(int r_no,String name)
{
this.r_no=r_no;
this.name=name;
}
void display()
{
System.out.println("roll no:"+r_no);
System.out.println("name:"+name);
}
}
class marks extends student
{
float m1,m2,m3,m4,m5;
marks(float m1,float m2,float m3,float m4,float m5)
{
this.m1=m1;
this.m2=m2;
this.m3=m3;
this.m4=m4;
this.m5=m5;
}
void display_marks()
{
System.out.println("Mark1:"+m1);
System.out.println("Mark2:"+m2);
System.out.println("Mark3:"+m3);
System.out.println("Mark4:"+m4);
System.out.println("Mark5:"+m5);
float avg;
avg=(m1+m2+m3+m4+m5)/5;
System.out.println("Average:"+avg);
}
}
class inheritance
{
public static void main(String arg[])
{
int r_no; 
String name;
float m1,m2,m3,m4,m5;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the roll no:");
r_no=sc.nextInt();
System.out.println("Enter the name:");
name=sc.next();
System.out.println("Enter the mark1:");
m1=sc.nextFloat();
System.out.println("Enter the mark2:");
m2=sc.nextFloat();
System.out.println("Enter the mark3:");
m3=sc.nextFloat();
System.out.println("Enter the mark4:");
m4=sc.nextFloat();
System.out.println("Enter the mark5:");
m5=sc.nextFloat();
marks m= new marks(m1,m2,m3,m4,m5);
m.getdata(r_no,name);
m.display();
m.display_marks();
}
}

