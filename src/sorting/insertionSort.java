package sorting;
import java.util.Scanner;
/**
 * Created by Eswaran on 16-Aug-17.
 */
public class insertionSort {

    public static void main(String[] args)

    {   Scanner sc=new Scanner(System.in);
        System.out .println("please enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array one by one and press enter");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int j;
        int temp;
        for(int i=1;i<arr.length;i++)
        {
            j=i-1;
            while(j>=0 && arr[j]>arr[j+1])
            {
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
                j-=1;
            }
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
