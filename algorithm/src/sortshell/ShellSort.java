package sortshell;

import java.util.Scanner;

public class ShellSort {

	/**
	 * Shell Sort
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
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n***************");
		
		int[] newArr = shellSort(arr);
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
	
	protected static int[] shellSort(int[] arr) {
		for(int incr = 3; incr > 0; incr--){
			for(int L = 0; L < (arr.length - 1) / incr; L++){ //增量递减，以增量3，2，1为例 
				for(int i = L + incr; i < arr.length; i += incr){ //重复分成的每个子列表 
					int temp = arr[i];
					for(int j = i - incr; j >= 0; j -= incr){ //对每个子列表应用插入排序 
						if(arr[j] > temp){
							arr[j+incr] = arr[j];
							arr[j] = temp;
						}
						/*for (int k = 0; k < arr.length; k++) {
							System.out.print(arr[k] + " ");
						}
						System.out.println();*/
					}
				}
			}
		}
		return arr;
	}

}