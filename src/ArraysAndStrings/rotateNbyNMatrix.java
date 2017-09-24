package ArraysAndStrings;

import java.util.Scanner;

/**
 * Created by Eswaran on 30-Aug-17.
 */
public class rotateNbyNMatrix {
    public static void main (String [] args)
    {

        System.out.println("please enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] array=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                array[i][j]=sc.nextInt();
            }
        int temp,k=n;
        for(int j=0;k>=2;j++,k-=2)
            for(int i=0;i<n-1;i++)
            {
                temp=array[j][i+j];
                array[j][i+j]=array[n-i-1-j][j];System.out.println(array[j][i+j]+"-->"+array[n-i-1-j][j]);
                array[n-i-1-j][j]=array[n-1-j][n-1-i-j];System.out.println(array[n-i-1-j][j]+"-->"+array[n-1-j][n-1-i-j]);
                array[n-1-j][n-1-i-j]=array[n-1-i-j][n-1-j];System.out.println(array[n-1-j][n-1-i-j]+"-->"+array[j][n-1-i-j]);
                array[n-1-j-i][n-1-j]=temp;System.out.println(array[j][n-1-i-j]+"-->"+array[j][i+j]);
                System.out.println();
            }
        for(int i=0;i<n;i++)
        {for(int j=0;j<n;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();}
    }
}
