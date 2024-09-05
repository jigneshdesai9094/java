class P5
{
	public static void main(String args[])
	{
		int arr1[][]={{5,6},{7,8}},arr2[][]={{1,2},{3,4}};
		System.out.println(" Two Matrix Follows");
		System.out.println("Matrix - 1");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nMatrix - 2");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nAddition Of Above Two Matrix");
			for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print((arr1[i][j]+arr2[i][j])+" ");
			}
			System.out.println();
		}
			System.out.println("\nSubstraction Of Above Two Matrix");
			for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print((arr1[i][j]-arr2[i][j])+" ");
			}
			System.out.println();
		}
		System.out.println("\nMultiplication Of Above Two Matrix");
			for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				int m=0;
				 for(int k=0;k<arr1[i].length;k++)
				 {
					 m=m+(arr1[i][k]*arr2[k][j]);
				 }
				 System.out.print(m+" ");
			}
			System.out.println();
		}
	}
}