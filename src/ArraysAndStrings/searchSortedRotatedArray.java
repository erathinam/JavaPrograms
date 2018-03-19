import java.util.*;
public class searchSortedRotatedArray{

/*
This algo finds the index of element in the array that is sorted and rotated.
arr is the array
checkItem is the element to be searched in the array
*/
	public static void main (String[] args) {
		int [] arr={19,80,1};
		int pivot=checkPivot(arr);
		int checkItem=19;
		if(checkItem==arr[pivot])
		    {System.out.println(pivot);}
		else if(checkItem<arr[0])
		    System.out.println(findIndex(pivot+1,arr.length-1,arr,checkItem));
		else if(checkItem>=arr[0])
		    System.out.println(findIndex(0,pivot-1,arr,checkItem));
	}
	
	static int findIndex(int startindex,int endindex,int[] arr,int checkItem)
	{
	    int middleindex=(startindex+endindex)/2;
	    if(arr[middleindex]==checkItem)
	        return middleindex;
	    if(arr[middleindex]>checkItem)
	        return findIndex(startindex,middleindex-1,arr,checkItem);
	    else
	        return findIndex(middleindex+1,endindex,arr,checkItem);
	}
	static int checkPivot(int[] arr)
	{int startindex=0,endindex=arr.length-1;
	    while(true)
	    {
	        int middleindex=(startindex+endindex)/2;
	        if(arr[middleindex]>arr[middleindex+1])
	            return middleindex;
	        if(arr[0]>=arr[middleindex])
	            {endindex=middleindex;}
	        else
	        {startindex=middleindex;}
	    }
	}
}
