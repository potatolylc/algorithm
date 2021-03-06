package overlyingaddition;

import java.util.Scanner;

public class OverlyingAdditionTest {

	/**
	 * Overlying Addition
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input an integer for value a.");
		int a = scanner.nextInt();
		System.out.println("Input an integer for times.");
		int time = scanner.nextInt();
		int result = overlyingAddition(a, time);
		System.out.println("Result: "+result);
	}
	
	protected static int overlyingAddition(int a, int time) {
		int sum = 1;
		int newNum = 1;
		int temp = 1;
		for(int i = 1; i < time; i++){ // calculate the addition from 1 to the number determined by time value, ex: 1+11+111+1111...
			temp *= 10;
			newNum += temp;
			sum += newNum;
		}
		sum *= a; // multiply the a value as multiple num
		return sum;
	}
}
