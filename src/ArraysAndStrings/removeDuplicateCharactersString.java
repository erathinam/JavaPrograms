package ArraysAndStrings;

import java.util.Scanner;

/** Problem: program to remove duplicates in the string
 * time complexity is O(N^2)
 * space complexity is O(N)
 * Created by Eswaran on 28-Aug-17.
 */
public class removeDuplicateCharactersString {
    public static void main (String args[])
    {
        System.out.println("please enter the string");
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        char[] s1=s.toCharArray();
        if(s.length()==0)
            System.out.println("please enter a valid string");
        else if(s.length()==1)
            System.out.println("the valid string is "+s);
        else
        { int tail=1,j;
            for(int i=1;i<s.length();i++) {
                for (j = 0; j < tail; j++) {
                    if (s1[j] == s1[i])
                        break;
                }
            if(j==tail)
            {
                char temp = s1[tail];
             s1[tail]=s1[i];
             s1[i]=temp;
             ++tail;}
            }System.out.println("the resultant string is ");
            for (int k=0;k<tail;k++)
                System.out.print(s1[k]);

        }


    }
}
