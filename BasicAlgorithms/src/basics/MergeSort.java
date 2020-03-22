package basics;

public class MergeSort {

	public static void main(String[] args) {

		Integer[] A = {2,1,0,9,23,3,2};
		
		//PseudoCode
		//Page No 31 in Introduction to Algorithms
		//MERGE(A,p,q,r)
		//n1 = q-p+1
		//n2 = r-q
		//let L[1..n1+1] and R[1..n2+1] be new arrays
		//for i =1 to n1
		//		L[i] = A[p+i-1] --Copy left half to 1st array
		//for j = 1 to n2
		// 		R[j] = A[q+j]
		// i = 1
		// j = 1
		//for k = p to r 
		//		if L[i] <= R[j]
		//			A[k] = L[i]
		//			i = i+1
		//		else 
		// 			A[k] = R[j]
		//			j = j+1
		
//		MergeSort(arr[], l,  r)
//		If r > l
//	     1. Find the middle point to divide the array into two halves:  
//	             middle m = (l+r)/2
//	     2. Call mergeSort for first half:   
//	             Call mergeSort(arr, l, m)
//	     3. Call mergeSort for second half:
//	             Call mergeSort(arr, m+1, r)
//	     4. Merge the two halves sorted in step 2 and 3:
//	             Call merge(arr, l, m, r)

		int arr[] = {12, 11, 13, 5, 6, 7}; 
		  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSortImpl ob = new MergeSortImpl(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
	}
	private static void printArray(int[] arr) {
		for(int l =0 ; l<arr.length ; l++){
			System.out.print(arr[l] + ",");
		}
		System.out.println();
	}
}

class MergeSortImpl {
	
	/**
	 * 
	 * @param arr - array to be sorted 
	 * @param p - initial index
	 * @param r - last index
	 */
	void sort(int[] arr, int p , int r){
		if(p < r){
			int q = (p + r )/2;
			sort(arr, p ,q);
			sort(arr , q+1 , r);
			
			//Merge the sorted halves
			
			merge(arr,p,q,r);
		}
	}
	
	void merge(int arr[], int initialIndex , int middle, int lastIndex){
		int n1 = middle-initialIndex+1;
		int n2 = lastIndex-middle;
		//Create temp arrays
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		//Copy the elements into the array
		for(int i=0; i<n1 ;i++){
			L[i] = arr[initialIndex+i];
		}
		for(int j =0;j<n2;j++){
			R[j] = arr[middle+1+j];
		}
		
		//Merge the temp arrays
		int i = 0; int j =0;
		int k = initialIndex;
		while(i<n1 && j<n2){
			if(L[i]<R[j]){
				arr[k] = L[i];
				i++;
			}else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		 /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
	}
}
