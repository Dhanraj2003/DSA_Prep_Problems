package Sorting;

/*
 insertion sort is a simple sorting algorithm that works by iteratively inserting 
 each element of unsorted list into its correct position in a sorted portion of the list.
 
 lt is like sorting playing cards in your hands.you split the card into two groups:the 
 sorted card and unsorted card.then you pick a card from the unsorted group and put it
 the sorted group.d 
 
 
 */

public class InsertionSort {
	
	public static void insertionSort(int[] a)
	{
		int n=a.length;
		int j,key;
		
		for(int i=1;i<n;i++)
		{
			key=a[i];
			j=i-1;
			
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		
		//print array
		
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}
	
	

	public static void main(String[] args) {
		//Insertion sort

		int[]a= {12,11,13,5,6};
	
		System.out.println("Insertion sort!!!");
		InsertionSort.insertionSort(a);
		
		
		
	}

}
