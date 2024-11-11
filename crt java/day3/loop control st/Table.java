//Table//
import java.util.Scanner;
class Table
{
public static void main(String args[])
{
int i=1,n;
Scanner sc = new Scanner(System.in);
System.out.print("enter the no:");
n=sc.nextInt();
for(i=1;i<=10;i++)
{
System.out.println(n+"X"+i+"="+(i*n));
}
}
}