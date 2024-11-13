import java.util.Arrays;
import java.util.*; 
class uni
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Java Program to print unique element of Array");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            System.out.print("Please give value for index "+ i +" : ");
            arr[i] = sc.nextInt();
        } 
        System.out.print("Unique values in array are : ");
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
            if (i == j)
                System.out.print( arr[i] + " ");
        }
    }}