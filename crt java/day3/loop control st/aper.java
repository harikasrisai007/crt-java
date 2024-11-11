//write a java program to print all perfect numbers between 1 to n//


import java.util.Scanner;
class aper
{
public static void main(String[] args)
{
int num, start=1, end=1000, i, sum;
for(num=start; num<=end; num++)
{
sum = 0;
for(i=1; i<num; i++)
{
if(num%i==0)
sum = sum+i;
}
if(sum==num)
System.out.print(num+ " ");
}
}
}