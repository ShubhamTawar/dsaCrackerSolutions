import java.util.Scanner;

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

	public static void reverse(int[] arr , int size) {
		int i = 0;
		int j = size - 1;
		int temp = 0;

		while(i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of the array....");
		int size = sc.nextInt();

		int[] arr = new int[size];

		readArray(arr , size);

		System.out.println("After reversing...");
		printArray(arr);
		reverse(arr , size);

		System.out.println("Before reversing...");
		printArray(arr);
	}
}