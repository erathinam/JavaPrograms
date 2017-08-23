package sorting;

import java.util.Scanner;

/**
 * Created by Eswaran on 16-Aug-17.
 */

/*
Best case= 0(n^2)
Worst case = o(n^2)
*/

public class selectionSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out .println("please enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array one by one and press enter");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int minimum=0,minindex=0;
        for(int i=0,j=i+1; i<n;i++,j=i+1)
        {
            minimum=arr[i];
            minindex=i;
            while(j<n) {
                if (arr[j] < minimum) {
                    minimum = arr[j];
                    minindex = j;
                }j++;
            }
            arr[minindex]=arr[i];
            arr[i]=minimum;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
