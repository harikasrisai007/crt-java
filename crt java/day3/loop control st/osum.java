import java.util.Scanner;
class osum
{
public static void main(String[] args) 
{
int n, i, oSum = 0;
Scanner sc = new Scanner(System.in);
System.out.print(" Please Enter any Number : ");
n = sc.nextInt();	
for(i = 1; i <= n; i = i + 2)
{
oSum = oSum + i; 
}
System.out.println("\n The Sum of Even Numbers upto " + n + "  =  "+oSum);
}
}