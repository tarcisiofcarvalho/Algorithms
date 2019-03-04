package sorting;

public class QuickSort {

	public static void main(String[] args) {

		int[] a = {9,7,1,3,5,8};
		
		int[] b = {8,4,2,6};
		
		int[] c = new int[a.length+b.length];
		
		int i;
		for(i=0;i<a.length;i++)
			c[i]=a[i];
		
		for(int j=0;j<b.length;j++)
			c[j+i]=b[j];

		for(int x: c)
			System.out.print(x + " ");
		
		System.out.println();
		
		sort(c,0,c.length-1);
		
		for(int z: c)
			System.out.print(z + " ");		
		
		/*int[] arr = {4,2,5,1,3,1,7,6,8};
		
		for(int i: arr)
			System.out.print(i + " ");

		sort(arr,0,arr.length-1);
		
		System.out.println();
		
		for(int i: arr)
			System.out.print(i + " ");
*/
	}
	
	public static void sort(int[] arr, int low, int high) {
		
		if (low >= high) {
			// A single element is
			// considered to be sorted
			return;
		}
		
		// 1. Choose the pivot (may be the mid element)
		int mid = low + (high-low) / 2;
		int temp = arr[mid];
		int pivot = temp;
		
		// 2. Move the pivot to the last element
		arr[mid] = arr[high];
		arr[high] = pivot;
		
		// 3. Sort algorithm
		// Swap elements such that all the elements less than pivot are to the left-end 
		// and all the elements greater than pivot are to the right end.
		// Elements equal to the pivot can go to the either side.
		int i = low;
		int j = high-1;
		
		// While right pointer is greater than or equal to left
		while(j>=i) {
			// Change condition
			if(arr[j] < pivot && arr[i] > pivot) { // j < and i >
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			// Exceptions - Just move pointers
			}else if (arr[j] < pivot && arr[i] <= pivot) { // j < and i <=
				++i;
			} else if (arr[j] >= pivot && arr[i] > pivot) { // j >= and i >
				--j;
			} else if (arr[j] >= pivot && arr[i] <= pivot) { // j >= and i <= 
				++i;
				--j;
			}			
		}
		
		// Bring the pivot back to its
		// appropriate place
		temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;

		sort(arr, low, i - 1); // sort array left of pivot
		sort(arr, i + 1, high); // sort array right of pivot
		
	}

}
