//write a java program to count numbere of digits in a number//

import java.util.Scanner;
class count
{
public static void main(String args[]) {
int i = 0;
int n = 325526;
System.out.println("given number:: " + n);
while(n != 0){
n = n / 10;
i++;
}
System.out.println("given integer are:: " + i);
}
}