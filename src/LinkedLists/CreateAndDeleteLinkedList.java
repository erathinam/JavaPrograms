package LinkedLists;

/**
 * Created by Eswaran on 11-Sep-17.
 */
public class CreateAndDeleteLinkedList {
    int data;
    CreateAndDeleteLinkedList next;

    public CreateAndDeleteLinkedList(int data)
    {
        this.data=data;
        this.next=null;
    }

    public static void main(String args[])
    {
        CreateAndDeleteLinkedList l1 = new CreateAndDeleteLinkedList(10);
        if(deleteFromList(l1,11))System.out.println("the item is deleted from list");
        else System.out.println("the item cannot be found in the list");
    }
    public static void appendToList(CreateAndDeleteLinkedList l1,int data)
    {   CreateAndDeleteLinkedList current=l1;
        while(current.next!=null)
        {
            current=current.next;
        }
        CreateAndDeleteLinkedList temp= new CreateAndDeleteLinkedList(data);
        current.next=temp;
    }
    public static Boolean deleteFromList(CreateAndDeleteLinkedList l1,int data)
    {
        if(l1==null)return false;
        CreateAndDeleteLinkedList current=l1;
        if(current.data==data)
        {current=current.next;
            return true;}
        while(current.next!=null)
        {   if(current.next.data!=data)
                current=current.next;
            else
        {
            current.next=current.next.next;
            return true;
        }
        }
            if(current.data==data)
            {l1=null;return true;}
            else
                return false;
        }
    }
