package sorting;
import java.util.Scanner;
/**
 * Created by Eswaran on 18-Aug-17.
 */
public class bubblesort {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the number of elements in the array");
    int n=sc.nextInt();
    int[] arr=new int [n];
    System.out.println("please enter the elements one by one in the array");
    for(int k=0;k< n;k++)
    {
        arr[k]=sc.nextInt();
    }
    int temp;
    for(int i=0;i<n-2;i++)
    {
        for(int j=0;j<n-i;j++)
        {
            if(arr[j]>arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    System.out.println("these are the elements of the array");
    for(int m=0;m<n;m++)
    {
        System.out.print(arr[m]+" ");
    }
    }

}
