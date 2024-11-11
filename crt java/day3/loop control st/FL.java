//write a java program to find first and last digitnof number//

import java.util.Scanner;
class FL
{   
public static void main(String args[]) 
{   
int n = 654165361;
int fDigit = 0;
int lDigit = 0;
lDigit = n%10;
System.out.println("Last digit: "+lDigit);
while(n!=0) {
fDigit = n%10;
n /= 10;
}
System.out.println("First digit: "+fDigit);
}
}
