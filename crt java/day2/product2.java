//write a program to enter product number,name,cost and qty and calculate total bill and display report//



import java.util.Scanner;
class product2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int pno;
String pname;
float pcost;
float pqty;

System.out.println("enter product number");
pno=sc.nextInt();
System.out.println("enter product name");
pname=sc.next();
System.out.println("enter product cost");
pcost=sc.nextFloat();
System.out.println("enter product qty");
pqty=sc.nextFloat();

float bill=pcost*pqty;


System.out.println("=======================================");

System.out.println("product number:"+pno);
System.out.println("product name:"+pname);
System.out.println("product cost:"+pcost);
System.out.println("product qty:"+pqty);
System.out.println("total bill:"+bill);
}
}
