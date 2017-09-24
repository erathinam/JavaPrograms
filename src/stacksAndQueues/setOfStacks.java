package stacksAndQueues;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 * Created by Eswaran on 24-Sep-17.
 */
public class setOfStacks {
    static int size;
    static int stackSize,setSize;
    static Stack[] s;
    setOfStacks(int stackSize,int setSize)
    {   s=new Stack[setSize];
        Stack s1=new Stack();
        this.size=0;
        this.stackSize=stackSize;
        this.setSize=setSize;
        s[size]=s1;
    }
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        System.out.println("what needs to be the size of stacks in the set");
        int stackSize=sc.nextInt();
        System.out.println("what needs to be the number of stacks in set");
        int setSize=sc.nextInt();
        setOfStacks s1=new setOfStacks(stackSize,setSize);
        s1.append(10);
        s1.append(11);
        System.out.println(s1.remove());
        System.out.println(s1.remove());

    }
    public static void append(int data)
    {   if(size== setSize-1 && s[size].size==stackSize)
        {
            System.out.println("Out of stack in set");
            throw new EmptyStackException();
        }
        if(s[size].size>stackSize-1)
        {
            size++;
            Stack s1=new Stack();
            s1.push(data);
            s[size]=s1;
        }
        else
        {
            s[size].push(data);
        }
    }
    public static int remove()
    {
        if(size==0 && s[size].size==0)
        {
            System.out.println("stack is empty");
            throw new EmptyStackException();
        }
        if(s[size].size==0)
            size--;
        return s[size].pop();
    }

}
