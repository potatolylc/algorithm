package sortinsertion;

import java.util.Scanner;

public class InsertionSort {

	/**
	 * Insertion Sort
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input an integer array of five numbers.");
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n**************");
		
		int[] newArr = insertionSort(arr);
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
	
	protected static int[] insertionSort(int[] arr){
		for(int i = 1; i < arr.length; i++){
			int temp = arr[i];
			int j = i-1;
			for(; j >= 0; j--){
				if(arr[j] > temp){
					arr[j+1] = arr[j];
				}
			}
			arr[j+1] = temp;
		}
		return arr;
	}

}
