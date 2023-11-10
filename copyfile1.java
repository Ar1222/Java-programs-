import java.io.*;
import java.io.IOException;
class copyfile1
{
public static void  main(String arg[])
{
System.out.println("\t\t COPY A FILE INTO ANOTHER FILE");
try
{
FileInputStream f1=new FileInputStream("file1.txt");
FileOutputStream f2=new FileOutputStream("file2.txt");
int c;
while((c=f1.read())!=-1)
{
f2.write(c);
}
f1.close();
f2.close();
System.out.println("FILE COPIED SUCCESUSFULLY");
}
catch(IOException e)
{
System.out.println("exception:"+e.toString());
}
}
}
