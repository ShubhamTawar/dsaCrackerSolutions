
// Problem link => https://leetcode.com/problems/sort-colors/
// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0

import java.util.Scanner;
import java.util.Arrays;

class Solution {
	private static Scanner sc = new Scanner(System.in);

	public static void readArray(int[] arr , int n) {
		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
	}

	public static void printArray(int[] arr) {
		for(int item : arr)
			System.out.print(item + " ");

		System.out.println();
	}


	
	// Approach 1 => By predefined sorting method
	// TC => O(nlogn) & SC => 0
	
	public static void sort1(int[] arr , int size) {
		Arrays.sort(arr);
	}

	// Approach 2 => By counting sort algo
	// TC => O(n) + 3 * O(n)  = O(n) + O(n) = O(n)  & SC => O(3) = O(1)
	public static void sort2(int[] arr , int size) {
		int[] freq = new int[3];


		for(int i : arr)
			freq[i]++;

		int j = 0;
		for(int i = 0 ; i < 3 ; i++) {
			while(freq[i] > 0) {
				arr[j++] = i;
				freq[i]--;
			}
		}
	}

	// Approach 3 => Dutch national flag (DNF) Algorithm
	// TC => O(n) & SC => O(1)

	    public static void sort3(int[] nums , int size) {
        int left = 0;
        int right = nums.length - 1;
        int curr = 0;
        
        while(curr <= right) {
            if(nums[curr] == 0) {
                nums[curr] = nums[left];
                nums[left] = 0;
                curr++;
                left++;
            } else if(nums[curr] == 2) {
                nums[curr] = nums[right];
                nums[right] = 2;
                right--;
            } else
                curr++;
        }
    }


	public static void main(String[] args) {

		System.out.print("Enter size of the array....");
		int size = sc.nextInt();

		int[] arr = new int[size];

		readArray(arr , size);

		System.out.println("Before Sorting...");
		printArray(arr);
		// sort1(arr , size);
		// sort2(arr , size);
		sort3(arr , size);

		System.out.println("After reversing...");
		printArray(arr);
	}
}