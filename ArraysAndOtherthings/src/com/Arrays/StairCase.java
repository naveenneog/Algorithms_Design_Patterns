package com.Arrays;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StairCase {

    // Complete the staircase function below.
    static void staircase(int n) {
    	for(int i =1 ; i<= n ;i++){
    		printStairs(i,n);
    	}

    }

    private static void printStairs(int i, int n) {
		printSpace(n-i);
		printHash(i);
		System.out.println();
	}

	private static void printHash(int i) {
		for(int sp = 0 ; sp < i ; sp++){
			System.out.print("#");
		}
		
	}

	private static void printSpace(int i) {
		for(int hs = 0 ; hs < i ; hs ++){
		System.out.print(" ");
		}
		
	}


    public static void main(String[] args) {
        int n = 4;
      
        staircase(n);

    }
}
