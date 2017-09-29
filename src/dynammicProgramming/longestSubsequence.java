package dynammicProgramming;

import java.util.Scanner;

/**
 * Created by eswaran on 9/29/17.
 *
 * This is a problem of finding longest common subsequence using dynamic programming.
 *
 * Time complexity - O(string1.length()*string2.length())
 * Space complexity- O(string1.length()*string2.length())
 *
 */
public class longestSubsequence {

    public static void main (String [] args)
    {
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the string 1");
        s1=sc.nextLine();
        System.out.println("please enter the string 2");
        s2=sc.nextLine();
        int[][] array=new int[s1.length()+1][s2.length()+1];
        for (int i=0;i<s1.length();i++)
        {
            array[i][0]=0;
        }
        for(int j=0;j<s2.length();j++)
        {
            array[0][j]=0;
        }
        for(int i=1;i<s1.length()+1;i++)
            for(int j=1;j<s2.length()+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    array[i][j]=array[i-1][j-1]+1;
                }
                else
                {
                    array[i][j]=Math.max(array[i][j-1],array[i-1][j]);
                }
            }
            System.out.println("The maximum number is "+array[s1.length()][s2.length()]);
    }
}
