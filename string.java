import java.util.Scanner;
class string
{
public static void main(String arg[])
{
String str1,str2,str3;
Scanner sc=new Scanner(System.in);
System.out.println("\t\t EQUALITY OF A TWO STRINGS");
System.out.println("Enter the first string:");
str1=sc.nextLine();
System.out.println("Enter the second string:");
str2=sc.nextLine();
if(str1.equals(str2))
{
System.out.println("strings are equal");
}
else
{
System.out.println("strings are not equal");
}
System.out.println("\t\tREVERSE THE STRING");
System.out.println("Enter the  string:");
str3=sc.nextLine();
System.out.println("Reverse the string is:");
char a[]=str3.toCharArray();
for(int i=a.length-1;i>0;i--)
{
System.out.println(a[i]);
}
}
}