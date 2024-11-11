//write a java program to find the all factorsof a number//

import java.util.Scanner;
class factor {
public static void main(String[] args) {
int n = 40;
for (int i = 1; i <= n; i++) {
if (n % i == 0) {
System.out.printf(" %d ", i);
}
}
}
}
