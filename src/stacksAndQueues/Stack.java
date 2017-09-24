package stacksAndQueues;
import LinkedLists.CreateAndDeleteLinkedList;

import java.util.EmptyStackException;

/**
 * Created by Eswaran on 24-Sep-17.
 */
public class Stack {
    CreateAndDeleteLinkedList top;
    int size=0;
    public void push(int number)
    {   if(top==null)
        {CreateAndDeleteLinkedList node=new CreateAndDeleteLinkedList(number);
        top=node;size=1;}
        else
    {
        CreateAndDeleteLinkedList node=new CreateAndDeleteLinkedList(number);
        node.next=top;
        top=node;
        size++;
    }
    }
    public int pop()
    {   try {
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }
    catch(Exception e){
        throw new EmptyStackException();
    }
    }
    public static void main (String args[])
    {
        Stack s1= new Stack();
        s1.push(2);
        s1.push(3);

        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }
}
