import java.util.*;
class eo
{
public static void main(String ...a)
{
int b[] = new int[]{ 1,2,3,4,5,6,7,8,9,10,11 }; 
int e=2, o=3;
 for(int i=0; i<a.length;i++)
{
if(b[i]%2==0)
{
e++;
}else
{
o++;
}
}
System.out.println("Total Even Number : " + e + "\nTotal Odd Number : "+o);
}
}