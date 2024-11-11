import java.util.Scanner;
class emp {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int eno;
String ename;
float esal;

System.out.println("enter employee number");
eno=sc.nextInt();
System.out.println("enter employee name");
ename=sc.next();
System.out.println("enter employee salary");
esal=sc.nextFloat();
System.out.println("-----------------------------");
System.out.println("employee number:"+eno);
System.out.println("employee name:"+ename);
System.out.println("employee salary:"+esal);

}
}