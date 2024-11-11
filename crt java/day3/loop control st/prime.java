//write a java program to check prime number or not//

import java.util.Scanner;
class prime {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int num = 29;
System.out.println("Enter any Number : ");
num=sc.nextInt();
boolean f = false;
if (num == 0 || num == 1) {
f = true;
}
for (int i = 2; i <= num / 2; ++i) {
if (num % i == 0) {
f = true;
break;
}
}
if (!f)
System.out.println(num + " is a prime number.");
else
System.out.println(num + " is not a prime number.");
}
}