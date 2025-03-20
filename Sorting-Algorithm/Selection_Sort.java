package Sorting;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {
		
		//Selection Sort
		
		int arr[]= {7,8,3,1,2};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			int smallest=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				{
					smallest=j;
				}

			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
