//Write a program to check the given number is Strong number or not.//

import java.util.Scanner;
class strong {
public static void main(String args[])
{
int num,oriNum,rem,fact,i,sum=0;
Scanner in = new Scanner(System.in);
System.out.println("Enter a number : ");
num=in.nextInt();
oriNum=num;
while (num>0)
{
rem=num%10;
fact=1;
for(i=1;i<=rem;i++){
fact*=i;
}
          System.out.println("fact : "+fact);
sum+=fact;
num=num/10;
}
if (sum == oriNum) {
System.out.println(oriNum + " is STRONG NUMBER");
} else 
{
System.out.println(oriNum + " is not a STRONG NUMBER");
}
}
}