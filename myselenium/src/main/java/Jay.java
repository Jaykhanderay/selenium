
public class Jay 
{
	public static void main(String args[])
	{
		int [] arr = {2,3,4,5,6};
		int target = 8;
		
	}
	
	 static int  bst(int[]arr,int target)
	{
		 
	
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
		 int  middle = (start + end) %2 ;
		 
		
		
		if (middle < target)
		{
			start = middle + 1;
		}
		
		else if  (middle >target)
		{
			end = middle - 1;
		}
		
		else 
		{
			return -1;
		}
		 return middle ;
	}
		return end;
}
}
