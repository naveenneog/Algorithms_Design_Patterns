package basics;

class BinarySearchExample {
	public static void binarySearch(Integer[] arr, int min_i, int max_i, int key) {
		int mid = (min_i + max_i) / 2;
		while (min_i <= max_i) {
			
			if (arr[mid] < key) {
				min_i = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				max_i = mid - 1;
			}
			mid = (min_i + max_i) / 2;
		}
		if (min_i > max_i) {
			System.out.println("Element is not found!");
		}
	}

	private static void binarySeach(Integer[] array, int min_i, int max_i, int key) {
		int mid = (min_i + max_i) / 2;

		while (min_i <= max_i) {
			System.out.println(mid);
			if (array[mid] < key) {
				min_i = mid + 1;
			}
			
			else if (array[mid] == key) {
				System.out.println("Value found at : " + mid);
				break;
			} else if (array[mid] > key) {
				max_i = mid - 1;
			}
			mid = (min_i + max_i) / 2;
		}
	}

	public static void main(String args[]) {
		// Integer arr[] = new Integer[]{10,20,30,40,50};
		Integer[] arr = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7 };
		int key = 2;
		int last = arr.length - 1;
		// binarySearch(arr,0,last,key);
		binarySeach(arr, 0, last, key);
	}
}