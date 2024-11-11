//write a program to enter student no, name, any three subjects of marks and calculate total and avg of the student and display report//
 

import java.util.Scanner;
class smarks
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sno,java,c,python,tot;
String sname;
float savg;

System.out.println("enter student number");
sno=sc.nextInt();
System.out.println("enter student name");
sname=sc.next();
System.out.println("enter java marks");
java=sc.nextInt();
System.out.println("enter c marks");
c=sc.nextInt();
System.out.println("enter python marks");
python=sc.nextInt();

tot=java+c+python;
savg=tot/3;

System.out.println("=======================================");

System.out.println("student number:"+sno);
System.out.println("student name:"+sname);
System.out.println("java marks:"+java);
System.out.println("c marks:"+c);
System.out.println("python marks:"+python);
System.out.println("avg marks:"+savg);
System.out.println("total marks:"+tot);
}
}