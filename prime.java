class prime
{
public static void main(String arg[])
{
int i=1,n,max=15;
System.out.println("the prime numbers between 1 to 15");
System.out.println(i);
start:
for(n=2;n<max;n++)
{
for(i=2;i<n;i++)
if(n%i==0)
continue start;
System.out.println(n);
}
}
}