package sorting;

import java.util.Scanner;

/**
 * Created by Eswaran on 23-Aug-17.
 */
/*
Best case complexity = o(nlogn)
Worst case complexity = o(nlogn)
*/
public class mergeSort {

    public static void main(String [] args)
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
            mergesorting(0,n-1,arr);
            for(int m=0;m<n;m++)
            {
                System.out.print(arr[m]+" ");
            }
    }
    }
   public static void mergesorting(int l,int r, int[] arr)
   {     //System.out.println("only two numbers");
        int size=r-l+1;
       if(size>2)
       {
           mergesorting(l,(size/2)-1+l,arr);
           mergesorting(size/2+l,r,arr);
           int [] left=new int[(size/2)];
           int [] right=new int[(r-(size/2+l))+1];
           for(int i=l,j=0;i<(size/2)+l;i++,j++)
           {
               left[j]=arr[i];
           }
           for(int i=size/2+l,j=0;i<=r;i++,j++)
           {
               right[j]=arr[i];
           }
           int i=0,j=0,k=l;
           while(i<left.length && j<right.length)
           {
               if(left[i]<=right[j])
               {arr[k]=left[i];i++;}
               else
               {arr[k]=right[j];j++;}
               k++;
           }
           while(i<left.length)
           {
            arr[k]=left[i];i++;k++;
           }
           while(j<left.length)
           {
               arr[k]=right[j];j++;k++;
           }
       }
       else if(size==2)
       {
           int temp;
           if(arr[l]>arr[r])
           {temp=arr[l];arr[l]=arr[r];arr[r]=temp;}

       }
   }

}
