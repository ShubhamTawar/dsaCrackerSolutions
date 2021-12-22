import java.util.Scanner;

class Solution {
	private static Scanner sc = new Scanner(System.in);
	
	public static void readArray(int[] arr , int n) {
		for(int i = 0 ; i < n ; i++)
			arr[i] = sc.nextInt();
	}

	public static void main(String[] args) {
		
		System.out.print("Enter size of the array....");
		int size = sc.nextInt();

		int[] arr = new int[size];

		readArray(arr , size);

	    int[] minMax = getMinMax(arr , size);

	    System.out.println("Minimum = " + minMax[0]);
	    System.out.println("Maximum = " + minMax[1]);

	}

	public static int[] getMinMax(int[] arr , int size) {
		int[] minMax = new int[2];

		minMax[0] = arr[0];
		minMax[1] = arr[0];

		for(int i = 1 ; i < size ; i++) {
			minMax[0] = Math.min(minMax[0] , arr[i]);
			minMax[1] = Math.max(minMax[1] , arr[i]);
		}

		return minMax;
	}
}
