package sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem: To check if the characters in the string are unique
 *
 *
 *
 * Created by Eswaran on 28-Aug-17.
 */
public class ifStringCharactersUnique {
public static void main (String args[])
{
    System.out.println("Please enter the string");
    Scanner sc = new Scanner(System.in);
    String s=new String();
    s=sc.next();
    System.out.println("the entered string is "+s);
    Map<Character,Integer> h=new HashMap<Character,Integer>();
    char[] s1=s.toCharArray();
    int i=0;
    for(;i<s.length();i++) {

        if (h.containsKey(s1[i])){
            System.out.println("the string is not unique");
            break;}
        else
            h.put(s1[i], 1);
    }
    if(i==s.length())
        System.out.println("the string is unique");
}
}
