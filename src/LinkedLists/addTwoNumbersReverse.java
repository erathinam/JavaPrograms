package LinkedLists;

import static LinkedLists.CreateAndDeleteLinkedList.appendToList;

/**
 * Created by Eswaran on 11-Sep-17.
 * This program adds two numbers which are in reverse order in a linked list. The sum is stored in an another linked list.
 *Time Complexity:max(O(n1),o(n2)) where are n1 and n2 are the number of digits for each of the numbers.
 * Space Complexity:max(o(n1),o(n2))
 */
public class addTwoNumbersReverse {
    public static void main (String args[])
    {
        CreateAndDeleteLinkedList l1=new CreateAndDeleteLinkedList(3);
        appendToList(l1,1);
        appendToList(l1,5);

        CreateAndDeleteLinkedList l2= new CreateAndDeleteLinkedList(5);
        appendToList(l2,9);
        appendToList(l2,2);

        CreateAndDeleteLinkedList l3=null;
        int temp1,temp2,sum=0,carryover=0;
        while(l1!=null || l2!=null)
        {   temp1=0;temp2=0;
            if(l1==null)
            {
                temp2=l2.data;
                l2=l2.next;
            }
            else if(l2==null)
            {
                temp1=l1.data;
                l1=l1.next;
            }
            else {
                temp1=l1.data;
                temp2=l2.data;
                l1=l1.next;
                l2=l2.next;
            }
            sum=(temp1+temp2+carryover)%10;
            carryover=(temp1+temp2+carryover)/10;
            l3=appendToOutput(l3,sum);
        }
        if(carryover!=0)
        {
            l3=appendToOutput(l3,carryover);
        }
        while(l3!=null)
        {
            if(l3.next!=null)System.out.print(l3.data+"-->");
            else System.out.println(l3.data);
            l3=l3.next;
        }
    }
    public static CreateAndDeleteLinkedList appendToOutput(CreateAndDeleteLinkedList l1,int sum) {
        if (l1 == null) {
            l1 = new CreateAndDeleteLinkedList(sum);
            return l1;
        }
        CreateAndDeleteLinkedList temp=new CreateAndDeleteLinkedList(sum);
        temp.next=l1;
        l1=temp;
        return l1;
    }
}
