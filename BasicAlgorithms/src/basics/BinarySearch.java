package basics;

public class BinarySearch {

	public static void main(String[] args) {
		Integer[] array = new Integer[]{0,1,2,3,4,5,6,7};
		int min_i = 0;
		int max_i = array.length -1;
		int val = 2;
		binarySeach(array, min_i, max_i, val);

	}

	private static void binarySeach(Integer[] array, int min_i, int max_i, int val) {
		int mid = (min_i + max_i )/ 2;
		
		while(min_i <= max_i){
			
			if(array[mid] < val){
				min_i = mid+1;
			}
			System.out.println(mid);
			if(array[mid] == val){
				System.out.println("Value found at : "+ mid);
				break;
			}
			else if (array[mid] > val){
				max_i = mid-1;
			}
			mid = ((min_i + max_i) / 2);
		}
	}

}
