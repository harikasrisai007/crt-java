//write a java program to find the all factorial of a number//

import java.util.Scanner;
class factorial {
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("enter any number");
int n=sc.nextInt();
int f=1;
while(n>1)
{
f=f*n;
n--;
}
System.out.println("the factorail of the given number is "+f);
}
}
