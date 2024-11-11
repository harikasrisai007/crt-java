//write a java program to find sum first and last digit of number //

import java.util.Scanner;
public class SFL
{
public static void main(String args[])
{
int n,fd,ld,sum;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a two digit number");
n=sc.nextInt();
fd=n/10;
n /= 10;
ld=n%10;
sum=fd+ld;
System.out.println("First digit=" + fd);
System.out.println("Last digit=" + ld);
System.out.println("Sum of first and last digit=" + sum);
}
}