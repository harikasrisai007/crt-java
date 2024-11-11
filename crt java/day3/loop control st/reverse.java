//write a java program to enter a number and print its reverse//

import java.util.Scanner;
class reverse   
{  
public static void main(String[] args)   
{  
int n = 1235345, rev= 0;  
while(n != 0)   
{  
int rem = n % 10;  
rev = rev * 10 + rem;  
n= n/10;  
}  
System.out.println("The reverse of the given number is: " + rev);  
}  
}  