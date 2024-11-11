import java.util.Scanner;
class esum
{
public static void main(String[] args) 
{
int n, i, eSum = 0;
Scanner sc = new Scanner(System.in);
System.out.print(" Please Enter any Number : ");
n = sc.nextInt();	
for(i = 2; i <= n; i = i + 2)
{
eSum = eSum + i; 
}
System.out.println("\n The Sum of Even Numbers upto " + n + "  =  "+eSum);
}
}