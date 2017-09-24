package stacksAndQueues;

import LinkedLists.CreateAndDeleteLinkedList;

import java.util.EmptyStackException;

/**
 * Created by Eswaran on 24-Sep-17.
 */
public class Queue {
    public CreateAndDeleteLinkedList top,bottom;
    public void enqueue(int data)
    {
        CreateAndDeleteLinkedList node=new CreateAndDeleteLinkedList(data);
        if(bottom==null){
            bottom=node;
            top=node;
        }
        else
        {
            bottom.next=node;
            bottom=bottom.next;
        }
    }

    public int dequeue()
    {   if(top==null)
    {
        throw new EmptyStackException();
    }
    int data=top.data;;
        if(top==bottom)
        {

            top=null;
            bottom=null;
        }
        else
        {
            top=top.next;
        }
        return data;
    }
    public static void main (String args[])
    {
        Queue q1 = new Queue();
        q1.enqueue(2);
        q1.enqueue(3);

        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
    }
}
