package sorting;

import java.util.Scanner;

/**
 * Created by Eswaran on 18-Aug-17.
 */

/*
Best case complexity = o(nlogn)
Worst case complexity = o(n^2)
*/
public class quickSort {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements in the array");
        int n=sc.nextInt();
        if(n<1) {
            System.out.println("please enter number of elements greater than 0 or less than 65537");
        }
        else
        {
        int[] arr=new int [n];
        System.out.println("please enter the elements one by one in the array");
        for(int k=0;k< n;k++)
        {
            arr[k]=sc.nextInt();
        }
            if(arr.length==1)
                System.out.println(arr[0]);
            else if(arr.length==2)
            partition(arr,0,1);
            else
                quicksort(arr,0,n-1);
        for(int m=0;m<n;m++)
        {
            System.out.print(arr[m]+" ");
        }
    }}
    public static void quicksort(int[] arr,int p,int q)
    {   if(p<q){
        int result=partition(arr,p,q);
        quicksort(arr,p,result-1);
        quicksort(arr,result+1,q);
    }}
    public static int partition(int[] arr, int p, int q) {
        int i = p - 1;
        int temp;
        int x = arr[q];
        for (int j = p; j < q; j++) {
            if (arr[j] < x) {
                i += 1;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            temp=arr[i+1];
            arr[i+1]=x;
            arr[q]=temp;
        return i+1;
    }
}
