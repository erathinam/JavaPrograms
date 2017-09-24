package LinkedLists;

import static LinkedLists.CreateAndDeleteLinkedList.appendToList;

/**
 * Created by Eswaran on 11-Sep-17.
 *
 * This problem removes the duplicates in linked list without temporary buffer
 *
 * Time Complexity:O(N^2)
 * Space Complexity:O(1)
 */
public class removeDuplicatesFromLinkedList {
    public static void main(String args[])
    {
        CreateAndDeleteLinkedList l1=new CreateAndDeleteLinkedList(1);
        appendToList(l1,3);
        appendToList(l1,2);
        appendToList(l1,1);
        appendToList(l1,2);
        appendToList(l1,1);
        appendToList(l1,5);
        appendToList(l1,6);
        appendToList(l1,5);
        removeDuplicates(l1);
        while(l1!=null)
        {
            if(l1.next!=null)System.out.print(l1.data+"-->");
            else System.out.println(l1.data);
            l1=l1.next;
        }

    }
    public static void removeDuplicates(CreateAndDeleteLinkedList l1)
    {
        CreateAndDeleteLinkedList current =l1;
        CreateAndDeleteLinkedList next=current.next;
        CreateAndDeleteLinkedList temp=current;
        while(current.next!=null){
            next=current.next;temp=current;
        while(next!=null)
        {
            if(next.data==current.data)
            {
                while(next.next!=null)
                {
                    if(next.next.data==current.data)
                        next=next.next;
                    else
                    {
                        temp.next=next.next;
                        next=next.next;
                        break;
                    }
                }
                if(next.next==null && next.data==current.data) {
                    temp.next = null;
                    break;
                }
            }temp=next;
            next=next.next;
        }current=current.next;}
    }
}
