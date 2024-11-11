import java.util.Scanner;
class add
{  
public static void main(String[] args)   
{ 
Scanner sc=new Scanner(System.in); 
int n, i = 1, sum = 0;  
System.out.println("enter the sum");
n=sc.nextInt();
while(i <= n)  
{    
sum = sum + i;    
i++;  
}    
System.out.println("Sum of  Natural Numbers is = " +sum);  
}  
}  