package ArraysAndStrings;
import java.util.Scanner;
/**
 * This program checks if a element in an m by n matrix is zero, and makes that row and column as zero.
 *
 * Time complexity -> O(N^2)
 * Space complexity ->O(M+N)
 *
 * Created by Eswaran on 30-Aug-17.
 */
public class makeRowAndColumnZero {
    public static void main (String [] args)
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the rows");
        int m = sc.nextInt();
        System.out.println("Please enter the size of the columns");
        int n = sc.nextInt();
        Boolean[] rows=new Boolean[m];
        Boolean[] columns=new Boolean[n];
        int[][] array= new int[m][n];
        System.out.println("Please enter the elements one by one and press enter after each");
        for(int i=0;i<m;i++)
        {rows[i]=false;
            for(int j=0;j<n;j++) {
                if(i==0)columns[j]=false;
                array[i][j] = sc.nextInt();
                if(array[i][j]==0)
                {
                    rows[i]=true;
                    columns[j]=true;
                }
            }}
        for(int i=0;i<m;i++)
        {
            if(rows[i])
                for(int k=0;k<n;k++)
                    array[i][k]=0;
        }
        for(int j=0;j<n;j++)
        {
            if(columns[j])
                for(int k=0;k<m;k++)
                    array[k][j]=0;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {System.out.print(array[i][j]+" ");}
    System.out.println();}}
}
