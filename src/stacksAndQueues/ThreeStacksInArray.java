package stacksAndQueues;

import java.util.EmptyStackException;
import java.util.Scanner;

/**
 * Created by Eswaran on 24-Sep-17.
 */
public class ThreeStacksInArray {
    static int top1,top2,top3,size;
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the individual array");
        size = sc.nextInt();
        int[] array=new int[size*3];
        top1=-1;top2=size-1;top3=size*2-1;
        append(10,0,array);
        append(11,0,array);
        append(12,0,array);
        append(13,0,array);
        System.out.println(remove(0,array));
        System.out.println(remove(0,array));
    }

    public static void append(int data,int stack,int[] array)
    {
        if(stack==0)
        { if(top1<top2)
        {
            top1++;array[top1]=data;}
            else {
            System.out.println("stack 1 full");
            return;
            }
    }
    else if(stack ==1)
        {
            if(top2<size)
            {

                top2++;
                array[top2]=data;
        }
        else{
                System.out.println("stack 2 full");
                return;
            }
        }
        else{
            if(top3<2*size)
            {
                top3++;
                array[top3]=data;

            }
            else
            {
                System.out.println("stack 3 is full");
                return;
            }
        }

    }
    public static int remove(int stack,int[] array)
    {   int data;
        if(stack==0){
            if(top1<0)
            throw new EmptyStackException();
            else
            {
            data=array[top1];
                top1-=1;return data;
        }}
        else if(stack==1){
            if(top2<((size)))
                throw new EmptyStackException();
            else
            {
                data=array[top2];
                top2-=1;return data;
            }
        }
        else{
            if(top3<2*(size)) {
                throw new EmptyStackException();
            }
            else
                {
                    data=array[top3];
                    top3-=1;return data;
                }
            }
        }
    }
