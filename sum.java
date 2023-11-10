import java.util.Scanner;
class sum
{
public static void main(String arg[])
{
int i,num,sum=0,digit;
Scanner sc=new Scanner(System.in);
System.out.println("\t\tSum of digits");
System.out.println("enter the number:");
num=sc.nextInt();
while(num>0)
{
digit=num%10;
sum=sum+digit;
num=num/10;
}
System.out.println("the sum of digits is:"+sum);
}
}