// Java program to find the power of a number//

import java.util.Scanner;
class power 
{
public static void main(String[] args) 
{
int base = 3, exponent = 2;
long result = 1;
while (exponent != 0) 
{
result *= base;
--exponent;
}
System.out.println("power of number = " + result);
}
}