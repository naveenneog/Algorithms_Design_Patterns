package com.Arrays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class minMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
//    	/find min
//    	find max
//    find the sum 
//    	substract min
//    	substract max
    	
    	int min  = findMin(arr);
    	int max = findMax(arr);
    	int tSum = 0;
    	for(int el : arr){
    		tSum += el;
    	}
    	System.out.print(tSum - min);
    	System.out.print(" ");
    	System.out.println(tSum - max);

    }

    private static int findMax(int[] arr) {
		int min = arr[0];
		for(int el= 0 ; el<arr.length ; el ++){
			if(arr[el] < min){
				min = arr[el];
			}
		}
		return min;
	}

	private static int findMin(int[] arr) {
		int max = arr[0];
		for(int el= 0 ; el<arr.length ; el ++){
			if(arr[el] > max){
				max = arr[el];
			}
		}
		return max;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
