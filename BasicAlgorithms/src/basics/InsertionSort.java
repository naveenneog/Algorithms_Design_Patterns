package basics;

public class InsertionSort {

	public static void main(String[] args) {
		//Take the array
		//Loop over the array 
		//Pick the jth element and move up down the array till it reaches sorted position
			//Loop max of 3 times unless the adjacent is greater than this element
		
		//PseudoCode
		//for i=1 to n-1
		// j = i;
		//while j > 0 and A[j]< A[j-1]
		//swap(A[j],A[j-1])
		//j = j-1
		
		Integer[] A = {2,1,0,9,23,3,2};
		
		for(int i=1 ; i<A.length ; i++){
			int j =i;
			printArray(A);
			while(j>0 && A[j] < A[j-1]){
				swap(A, j,j-1);
				
				j = j-1;
			}
		}
		
		System.out.println("Sorted Array with Insertion Sort is :");
		printArray(A);

	}

	private static void printArray(Integer[] A) {
		for(int l =0 ; l<A.length ; l++){
			System.out.print(A[l] + ",");
		}
		System.out.println();
	}

	private static void swap(Integer[] a, Integer i, Integer j) {
		System.out.println();
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

}
