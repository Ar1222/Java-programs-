import java.util.*;
interface A
{
int a=80;
int b=90;
void show();
}
interface B
{
int a=80;
int b=90;
void show();
}
class C
{
int c,d,e;
double f;
public void show()
{
c=A.a+A.b;
d=B.a-B.b;
e=A.a*B.b;
f=A.b/B.a;
System.out.println("\t\t ARITHMETIC OPERATION BY USING INTERFACE");
System.out.println("Addition:"+c);
System.out.println("Subtraction:"+d);
System.out.println("Multiplication:"+e);
System.out.println("Division:"+f);
}
}
class test
{
public static void main(String arg[])
{
C obj=new C();
obj.show();
}
}

