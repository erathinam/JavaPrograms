package ArraysAndStrings;

import java.util.Scanner;

/**
 * To check if the two strings are anagrams
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Created by Eswaran on 28-Aug-17.
 */
public class checkIfAnagram {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter the string s1");
        String s1= sc.next();
        System.out.println("please enter the string s2");
        String s2= sc.next();
        if(anagramCheck(s1,s2))
            System.out.println("the two strings are anagrams");
        else
            System.out.println("the two strings are not anagrams");
    }


public static Boolean anagramCheck(String s1,String s2)
{
    if(s1.length()!=s2.length())
        return false;
    int[] array=new int[256];
    for(int i=0;i<s1.length();i++)
    {
        array[s1.charAt(i)]+=1;
    }
    for(int i=0;i<s1.length();i++)
    {
        if(array[s2.charAt(i)]<1)return false;
        else
            array[s2.charAt(i)]-=1;
    }
    for(int j=0;j<array.length;j++)
    {
        if(array[j]!=0)return false;
    }
    return true;
}}
