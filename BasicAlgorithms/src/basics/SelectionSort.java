package basics;

public class SelectionSort {
	static int arr[] = {1,3,4,2,9,6,7,0};
	
	public static void main(String[] args) {
		
		int startIndex = 0;
		int smallIndex ;
		//Find Smallest Index
		for( startIndex=0 ; startIndex < arr.length ; startIndex++){
			//Start with the First Index
		smallIndex = findSmallestIndex(arr , startIndex);
		//Find the smallest Elements index 
		arr = swapElementWith(arr,startIndex,smallIndex);
		//Swap with the smallest element and start index
		System.out.println(arr[smallIndex]);
		}
		System.out.println("Sorted Array");
		for(int i=0;i<arr.length ; i++){
			System.out.print(arr[i]);
		}
		//Repeat

	}

	private static int[] swapElementWith(int[] arr, int startIndex, int smallIndex) {
		
		int temp = arr[startIndex];
		arr[startIndex] = arr[smallIndex];
		arr[smallIndex] = temp;
		
		return arr;
		
		
	}

	private static int findSmallestIndex(int[] arr, int startIndex) {
		int smallIndex = startIndex;
		for(int i= startIndex+1 ; i< arr.length ; i++){
			if(arr[smallIndex] > arr[i]){
				smallIndex = i;
				System.out.println(smallIndex);
			}
		}
		System.out.println("Small Value"+arr[smallIndex]);
		return smallIndex;
	}

}
