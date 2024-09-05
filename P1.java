import java.util.*;
class P1
{
  public static void main(String args[])
  {
    int arr[]=new int[args.length];
	int last=arr.length-1;
	System.out.println("Before Sorting ::");
    for(int i=0;i<args.length;i++)
	{
	  arr[i]=Integer.parseInt(args[i]);
	  System.out.print(arr[i]+" ");
	}
	/*for(int i=0;i<arr.length-1;i++)
	{
		int f=0;
		for(int j=0;j<last;j++)
		{
			if(arr[j]>arr[j+1])
			{
				arr[j]=arr[j]+arr[j+1];
				arr[j+1]=arr[j]-arr[j+1];
				arr[j]=arr[j]-arr[j+1];
				f++;
			}
		}

		if(f==0)
			break;
		last--;
	}*/
	Arrays.sort(arr);
	System.out.println("\nAfter sorting ::");
    for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+" ");
    System.out.println("\nMinimum Value : "+arr[0]+" Maximum Value : "+arr[arr.length-1]);	 
  }
 
}