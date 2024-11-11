//write a java program to calculate the sum of digits of a number//

import java.util.Scanner;  
class sd   
{  
public static void main(String args[])  
{  
int n, d, s = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
n = sc.nextInt();  
while(n > 0)  
{    
d = n % 10;   
s = s+ d;    
n = n / 10;  
}   
System.out.println("Sum of Digits: "+s);  
}  
}  