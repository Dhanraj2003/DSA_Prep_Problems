package Sorting;

public class Bubble_Sort {
	
	public static void printarray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		
		// Bubble Sort
		
		int a[]= {7,8,3,1,2,19,390,78};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		
		printarray(a);

	}

}
