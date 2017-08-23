

package sorting;
import java.util.Scanner;
/**
 * Created by Eswaran on 18-Aug-17.
 */

/*
Best case complexity = o(n)
Worst case complexity = o(n^2)
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
    Boolean swapped = true;
    for(int i=0;i<n-1 && swapped;i++)
    {   swapped=false;
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
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
