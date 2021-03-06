package sortbubble;

import java.util.Scanner;

public class BubbleSortTest {

	/**
	 * Bubble Sort
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input an integer array of five numbers.");
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n**************");

		int[] newArr = bubbleSort(arr);

		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "  ");
		}
	}

	protected static int[] bubbleSort(int[] arr) {
		int temp = 0;
		for (int i = arr.length - 1; i > 0; i--) { // Let the (n-1)th element be
													// the standard, until 1
			for (int j = 0; j < i; j++) {
				if (arr[j + 1] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				// Show the procedure
				/*
				 * for (int ii = 0; ii < arr.length; ii++) {
				 * System.out.print(arr[ii] + "  "); }
				 * System.out.println("\n**************");
				 */
			}
		}
		return arr;
	}

}
